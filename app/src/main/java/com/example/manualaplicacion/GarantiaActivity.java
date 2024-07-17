package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GarantiaActivity extends AppCompatActivity {

    Button ButtonBack3;
    TextView textDocumentosBasicos;
    TextView textFabricantesOEM;
    TextView textTablaGarantias;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garantia);

        ButtonBack3=(Button)findViewById(R.id.ButtonBack3);
        ButtonBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBack3 = new Intent(GarantiaActivity.this,MainActivity.class);
                startActivity(ButtonBack3);
            }
        });

        textDocumentosBasicos =(TextView)findViewById(R.id.textDocumentosBasicos);
        textDocumentosBasicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(GarantiaActivity.this,GarantiasDoc.class);
                startActivity(Docs);
            }
        });

        textFabricantesOEM =(TextView)findViewById(R.id.textFabricantesOEM);
        textFabricantesOEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Fab = new Intent(GarantiaActivity.this,Fabricantes.class);
                startActivity(Fab);
            }
        });

        textTablaGarantias =(TextView)findViewById(R.id.textTablaGarantias);
        textTablaGarantias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(GarantiaActivity.this,Tabla.class);
                startActivity(Tab);
            }
        });


    }
}