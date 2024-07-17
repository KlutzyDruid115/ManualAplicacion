package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento20;
import FabricantesDocumentacion.Documento21;
import FabricantesDocumentacion.Documento22;
import FabricantesDocumentacion.Documento23;
import FabricantesDocumentacion.Documento24;
import FabricantesDocumentacion.Documento25;
import FabricantesDocumentacion.Documento6;

public class BateriaActivity extends AppCompatActivity {

    Button ButtonBackBaterias;
    TextView BateriaDoc1;
    TextView BateriaDoc2;
    TextView BateriaDoc3;
    TextView BateriaDoc4;
    TextView BateriaDoc5;
    TextView BateriaDoc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bateria);

        ButtonBackBaterias=(Button)findViewById(R.id.ButtonBackBaterias);
        ButtonBackBaterias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackBaterias = new Intent(BateriaActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackBaterias);
            }
        });

        BateriaDoc1 =(TextView)findViewById(R.id.BateriaDoc1);
        BateriaDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento20.class);
                startActivity(Tab);
            }
        });
        BateriaDoc2 =(TextView)findViewById(R.id.BateriaDoc2);
        BateriaDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento21.class);
                startActivity(Tab);
            }
        });
        BateriaDoc3 =(TextView)findViewById(R.id.BateriaDoc3);
        BateriaDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento22.class);
                startActivity(Tab);
            }
        });
        BateriaDoc4 =(TextView)findViewById(R.id.BateriaDoc4);
        BateriaDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento23.class);
                startActivity(Tab);
            }
        });
        BateriaDoc5 =(TextView)findViewById(R.id.BateriaDoc5);
        BateriaDoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento24.class);
                startActivity(Tab);
            }
        });
        BateriaDoc6 =(TextView)findViewById(R.id.BateriaDoc6);
        BateriaDoc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(BateriaActivity.this, Documento25.class);
                startActivity(Tab);
            }
        });


    }
}