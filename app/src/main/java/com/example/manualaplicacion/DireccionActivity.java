package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento45;
import FabricantesDocumentacion.Documento46;
import FabricantesDocumentacion.Documento6;

public class DireccionActivity extends AppCompatActivity {

    Button ButtonBackDIRECCION;
    TextView DireccionDoc1;
    TextView DireccionDoc2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);

        ButtonBackDIRECCION=(Button)findViewById(R.id.ButtonBackDIRECCION);
        ButtonBackDIRECCION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackDIRECCION = new Intent(DireccionActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackDIRECCION);
            }
        });
        DireccionDoc1 =(TextView)findViewById(R.id.DireccionDoc1);
        DireccionDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(DireccionActivity.this, Documento45.class);
                startActivity(Tab);
            }
        });

        DireccionDoc2 =(TextView)findViewById(R.id.DireccionDoc2);
        DireccionDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(DireccionActivity.this, Documento46.class);
                startActivity(Tab);
            }
        });


    }
}