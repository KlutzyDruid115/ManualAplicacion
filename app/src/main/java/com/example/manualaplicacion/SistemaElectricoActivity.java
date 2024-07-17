package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento32;
import FabricantesDocumentacion.Documento6;

public class SistemaElectricoActivity extends AppCompatActivity {

    Button ButtonBackElectrico;
    TextView SistemaElecDoc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_electrico);

        ButtonBackElectrico=(Button)findViewById(R.id.ButtonBackElectrico);
        ButtonBackElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackElectrico = new Intent(SistemaElectricoActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackElectrico);
            }
        });

        SistemaElecDoc1 =(TextView)findViewById(R.id.SistemaElecDoc1);
        SistemaElecDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SistemaElectricoActivity.this, Documento32.class);
                startActivity(Tab);
            }
        });

    }
}