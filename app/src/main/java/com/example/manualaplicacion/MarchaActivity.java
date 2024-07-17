package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento26;
import FabricantesDocumentacion.Documento27;
import FabricantesDocumentacion.Documento28;
import FabricantesDocumentacion.Documento29;
import FabricantesDocumentacion.Documento30;
import FabricantesDocumentacion.Documento31;
import FabricantesDocumentacion.Documento6;

public class MarchaActivity extends AppCompatActivity {

    Button ButtonBackMarcha;
    TextView MarchasDoc1;
    TextView MarchasDoc2;
    TextView MarchasDoc3;
    TextView MarchasDoc4;
    TextView MarchasDoc5;
    TextView MarchasDoc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcha);

        ButtonBackMarcha=(Button)findViewById(R.id.ButtonBackMarcha);
        ButtonBackMarcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackMarcha = new Intent(MarchaActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackMarcha);
            }
        });

        MarchasDoc1 =(TextView)findViewById(R.id.MarchasDoc1);
        MarchasDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento26.class);
                startActivity(Tab);
            }
        });
        MarchasDoc2 =(TextView)findViewById(R.id.MarchasDoc2);
        MarchasDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento27.class);
                startActivity(Tab);
            }
        });
        MarchasDoc3 =(TextView)findViewById(R.id.MarchasDoc3);
        MarchasDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento28.class);
                startActivity(Tab);
            }
        });
        MarchasDoc4 =(TextView)findViewById(R.id.MarchasDoc4);
        MarchasDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento29.class);
                startActivity(Tab);
            }
        });
        MarchasDoc5 =(TextView)findViewById(R.id.MarchasDoc5);
        MarchasDoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento30.class);
                startActivity(Tab);
            }
        });
        MarchasDoc6 =(TextView)findViewById(R.id.MarchasDoc6);
        MarchasDoc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MarchaActivity.this, Documento31.class);
                startActivity(Tab);
            }
        });

    }
}