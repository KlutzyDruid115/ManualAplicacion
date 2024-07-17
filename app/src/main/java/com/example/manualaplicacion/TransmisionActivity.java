package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento33;
import FabricantesDocumentacion.Documento34;
import FabricantesDocumentacion.Documento35;
import FabricantesDocumentacion.Documento6;

public class TransmisionActivity extends AppCompatActivity {

    Button ButtonBackTransmicion;
    TextView TransmisionDoc1;
    TextView TransmisionDoc2;
    TextView TransmisionDoc3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transmision);

        ButtonBackTransmicion=(Button)findViewById(R.id.ButtonBackTransmicion);
        ButtonBackTransmicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackTransmicion = new Intent(TransmisionActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackTransmicion);
            }
        });

        TransmisionDoc1 =(TextView)findViewById(R.id.TransmisionDoc1);
        TransmisionDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(TransmisionActivity.this, Documento33.class);
                startActivity(Tab);
            }
        });
        TransmisionDoc2 =(TextView)findViewById(R.id.TransmisionDoc2);
        TransmisionDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(TransmisionActivity.this, Documento34.class);
                startActivity(Tab);
            }
        });
        TransmisionDoc3 =(TextView)findViewById(R.id.TransmisionDoc3);
        TransmisionDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(TransmisionActivity.this, Documento35.class);
                startActivity(Tab);
            }
        });

    }
}