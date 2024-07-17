package FabricantesDocumentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.manualaplicacion.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Documento29 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documento1);
        pdfView = findViewById(R.id.pdfView);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream inputStream = getAssets().open("29 A) IS54299.pdf");
                    pdfView.fromStream(inputStream).load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Button btnSavePDF = findViewById(R.id.btnSavePDF);
        btnSavePDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePdfToDevice();
            }
        });
    }
    private void savePdfToDevice() {
        try {
            InputStream inputStream = getAssets().open("29 A) IS54299.pdf");

            File documentsDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
            File pdfManualDirectory = new File(documentsDirectory, "PDFManual");

            // Crear la carpeta si no existe
            if (!pdfManualDirectory.exists()) {
                pdfManualDirectory.mkdir();
            }

            File pdfFile = new File(pdfManualDirectory, "IS54299_saved.pdf");

            OutputStream outputStream = new FileOutputStream(pdfFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.close();
            inputStream.close();

            Toast.makeText(this, "PDF guardado en " + pdfFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
