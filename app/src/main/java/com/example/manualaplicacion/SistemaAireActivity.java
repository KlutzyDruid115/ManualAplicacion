package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento42;
import FabricantesDocumentacion.Documento43;
import FabricantesDocumentacion.Documento44;
import FabricantesDocumentacion.Documento6;

public class SistemaAireActivity extends AppCompatActivity {

    Button ButtonBackSistemaAIRE;
    TextView AireDoc1;
    TextView AireDoc2;
    TextView AireDoc3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_aire);

        ButtonBackSistemaAIRE=(Button)findViewById(R.id.ButtonBackSistemaAIRE);
        ButtonBackSistemaAIRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackSistemaAIRE = new Intent(SistemaAireActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackSistemaAIRE);
            }
        });
        AireDoc1 =(TextView)findViewById(R.id.AireDoc1);
        AireDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SistemaAireActivity.this, Documento42.class);
                startActivity(Tab);
            }
        });

        AireDoc2 =(TextView)findViewById(R.id.AireDoc2);
        AireDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SistemaAireActivity.this, Documento43.class);
                startActivity(Tab);
            }
        });
        AireDoc3 =(TextView)findViewById(R.id.AireDoc3);
        AireDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SistemaAireActivity.this, Documento44.class);
                startActivity(Tab);
            }
        });



    }
}