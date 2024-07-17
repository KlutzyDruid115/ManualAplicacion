package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento38;
import FabricantesDocumentacion.Documento39;
import FabricantesDocumentacion.Documento6;

public class EjesActivity extends AppCompatActivity {

    Button ButtonBackEjes;
    TextView EjesDoc1;
    TextView EjesDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejes);

        ButtonBackEjes=(Button)findViewById(R.id.ButtonBackEjes);
        ButtonBackEjes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackEjes = new Intent(EjesActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackEjes);
            }
        });

        EjesDoc1 =(TextView)findViewById(R.id.EjesDoc1);
        EjesDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EjesActivity.this, Documento38.class);
                startActivity(Tab);
            }
        });
        EjesDoc2 =(TextView)findViewById(R.id.EjesDoc2);
        EjesDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EjesActivity.this, Documento39.class);
                startActivity(Tab);
            }
        });

    }
}