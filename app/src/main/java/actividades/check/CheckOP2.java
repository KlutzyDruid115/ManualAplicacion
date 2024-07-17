package actividades.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.manualaplicacion.R;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.ContentValues;

import android.graphics.Canvas;
import android.graphics.Color;

import android.provider.MediaStore;

import java.io.OutputStream;
import java.util.Date;

import android.content.ContentResolver;




public class CheckOP2 extends AppCompatActivity {

    private static final int REQUEST_CODE_PERMISSION = 123;
    private Button btnCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_op2);


        btnCapture = findViewById(R.id.btnCapture);
        btnCapture.setOnClickListener(v -> captureScreen());
    }

    private void captureScreen() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_CODE_PERMISSION);
            return;
        }

        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap screenshot = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(screenshot);
        canvas.drawColor(Color.WHITE); // Fondo blanco para la captura
        rootView.draw(canvas);
        rootView.setDrawingCacheEnabled(false);

        String fileName = "Screenshot_" + new Date().getTime() + ".png";
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE, fileName);
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");

        ContentResolver resolver = getContentResolver();
        // Insertar la captura de pantalla en la galería
        try {
            OutputStream outputStream = resolver.openOutputStream(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            screenshot.compress(Bitmap.CompressFormat.PNG, 90, outputStream);
            assert outputStream != null;
            outputStream.close();
            Toast.makeText(this, "Captura de pantalla guardada en la galería", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error al guardar la captura de pantalla", Toast.LENGTH_SHORT).show();
        }
    }
}