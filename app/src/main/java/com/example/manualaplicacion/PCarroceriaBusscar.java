package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento51;
import FabricantesDocumentacion.Documento52;
import FabricantesDocumentacion.Documento53;
import FabricantesDocumentacion.Documento6;

public class PCarroceriaBusscar extends AppCompatActivity {

    Button ButtonBackParteBusscar;
    TextView BusscarDoc1;
    TextView BusscarDoc2;
    TextView BusscarDoc3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_busscar);

        ButtonBackParteBusscar = (Button) findViewById(R.id.ButtonBackParteBusscar);
        ButtonBackParteBusscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteBusscar = new Intent(PCarroceriaBusscar.this, Fabricantes.class);
                startActivity(ButtonBackParteBusscar);
            }
        });
        BusscarDoc1 =(TextView)findViewById(R.id.BusscarDoc1);
        BusscarDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaBusscar.this, Documento51.class);
                startActivity(Tab);
            }
        });

        BusscarDoc2 =(TextView)findViewById(R.id.BusscarDoc2);
        BusscarDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaBusscar.this, Documento52.class);
                startActivity(Tab);
            }
        });

        BusscarDoc3 =(TextView)findViewById(R.id.BusscarDoc3);
        BusscarDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaBusscar.this, Documento53.class);
                startActivity(Tab);
            }
        });

    }
}