package com.example.manualaplicacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.OutputStream;
import java.util.Date;

import actividades.check.CheckOP1;

public class GarantiasDoc extends AppCompatActivity {

    Button ButtonBackDC;

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button btnCapture;

    private static final int REQUEST_CODE_PERMISSION = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garantias_doc);

        setContentView(R.layout.activity_garantias_doc);
        ButtonBackDC=(Button)findViewById(R.id.ButtonBackDC);
        ButtonBackDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackDC = new Intent(GarantiasDoc.this,GarantiaActivity.class);
                startActivity(ButtonBackDC);
            }
        });

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        btnCapture = findViewById(R.id.btnCapture);

        // Agregar un listener para los checkboxes
        checkBox1.setOnCheckedChangeListener(checkBoxListener);
        checkBox2.setOnCheckedChangeListener(checkBoxListener);
        checkBox3.setOnCheckedChangeListener(checkBoxListener);
        checkBox4.setOnCheckedChangeListener(checkBoxListener);

        // Inicialmente desactivar el botón
        btnCapture.setEnabled(false);


        // Temas para el modo oscuro y claro //

        TextView textView = findViewById(R.id.textView);
        int textColor = getResources().getColor(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES
                ? R.color.text_color_dark
                : R.color.text_color_light);

        textView.setTextColor(textColor);

        //checkbox//
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        TypedArray typedArray = getTheme().obtainStyledAttributes(
                new int[]{R.attr.check_box_text_color});
        int checkBoxTextColor = typedArray.getColor(0, 0);
        typedArray.recycle();

        checkBox1.setTextColor(checkBoxTextColor);

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        TypedArray typedArray2 = getTheme().obtainStyledAttributes(
                new int[]{R.attr.check_box_text_color});
        int checkBoxTextColor2 = typedArray2.getColor(0, 0);
        typedArray.recycle();

        checkBox2.setTextColor(checkBoxTextColor2);

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        TypedArray typedArray3 = getTheme().obtainStyledAttributes(
                new int[]{R.attr.check_box_text_color});
        int checkBoxTextColor3 = typedArray3.getColor(0, 0);
        typedArray.recycle();

        checkBox3.setTextColor(checkBoxTextColor3);

        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        TypedArray typedArray4 = getTheme().obtainStyledAttributes(
                new int[]{R.attr.check_box_text_color});
        int checkBoxTextColor4 = typedArray4.getColor(0, 0);
        typedArray.recycle();

        checkBox4.setTextColor(checkBoxTextColor4);

        Button btnCapture = findViewById(R.id.btnCapture);
        int buttonBgColor = getResources().getColor(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES
                ? R.color.button_bg_dark
                : R.color.button_bg_light);
        int buttonTextColor = getResources().getColor(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES
                ? R.color.button_text_dark
                : R.color.button_text_light);

        btnCapture.setBackgroundColor(buttonBgColor);
        btnCapture.setTextColor(buttonTextColor);


        btnCapture = findViewById(R.id.btnCapture);
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        if (ContextCompat.checkSelfPermission(GarantiasDoc.this,
                        android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(GarantiasDoc.this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                            REQUEST_CODE_PERMISSION);
                } else {
                    captureScreenshot();
                }
            }
        });
    }
// Listener para los checkboxes
        private final CheckBox.OnCheckedChangeListener checkBoxListener = new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Verificar si todos los checkboxes están marcados
                if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()) {
                    btnCapture.setEnabled(true); // Habilitar el botón
                } else {
                    btnCapture.setEnabled(false); // Deshabilitar el botón
                }
            }
        };

        private void captureScreenshot () {
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            Bitmap screenshotBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);

            String fileName = "screenshot_" + new Date().getTime() + ".png";

            ContentValues values = new ContentValues();
            values.put(MediaStore.Images.Media.DISPLAY_NAME, fileName);
            values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");

            ContentResolver resolver = getContentResolver();
            Uri imageUri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

            try {
                OutputStream outputStream = resolver.openOutputStream(imageUri);
                screenshotBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                    Toast.makeText(this, "Captura de pantalla guardada en " + imageUri.toString(), Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "Error al guardar la captura de pantalla", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onRequestPermissionsResult ( int requestCode, @NonNull String[] permissions,
        @NonNull int[] grantResults){
            super.onRequestPermissionsResult(requestCode, permissions, grantResults); // Llamar al método super
            if (requestCode == REQUEST_CODE_PERMISSION) {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    captureScreenshot();
                } else {
                    Toast.makeText(this, "Permiso denegado, no se puede tomar la captura de pantalla", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }