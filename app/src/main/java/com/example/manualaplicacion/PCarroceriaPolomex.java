package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento49;
import FabricantesDocumentacion.Documento50;
import FabricantesDocumentacion.Documento6;

public class PCarroceriaPolomex extends AppCompatActivity {
    Button ButtonBackPartePolomex;
    TextView PolomexDoc1;
    TextView PolomexDoc2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_polomex);

        ButtonBackPartePolomex = (Button) findViewById(R.id.ButtonBackPartePolomex);
        ButtonBackPartePolomex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackPartePolomex = new Intent(PCarroceriaPolomex.this, Fabricantes.class);
                startActivity(ButtonBackPartePolomex);
            }
        });

        PolomexDoc1 =(TextView)findViewById(R.id.PolomexDoc1);
        PolomexDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaPolomex.this, Documento49.class);
                startActivity(Tab);
            }
        });
        PolomexDoc2 =(TextView)findViewById(R.id.PolomexDoc2);
        PolomexDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaPolomex.this, Documento50.class);
                startActivity(Tab);
            }
        });


    }
}