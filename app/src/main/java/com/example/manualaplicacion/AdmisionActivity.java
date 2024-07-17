package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento1;
import FabricantesDocumentacion.Documento10;
import FabricantesDocumentacion.Documento11;
import FabricantesDocumentacion.Documento12;
import FabricantesDocumentacion.Documento9;

public class AdmisionActivity extends AppCompatActivity {

    Button ButtonBackAdmision;
    TextView AdmisionDoc1;
    TextView AdmisionDoc2;
    TextView AdmisionDoc3;
    TextView AdmisionDoc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admision);

        ButtonBackAdmision=(Button)findViewById(R.id.ButtonBackAdmision);
        ButtonBackAdmision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackAdmision = new Intent(AdmisionActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackAdmision);
            }
        });

        AdmisionDoc1 =(TextView)findViewById(R.id.AdmisionDoc1);
        AdmisionDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(AdmisionActivity.this, Documento9.class);
                startActivity(Tab);
            }
        });
        AdmisionDoc2 =(TextView)findViewById(R.id.AdmisionDoc2);
        AdmisionDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(AdmisionActivity.this, Documento10.class);
                startActivity(Tab);
            }
        });
        AdmisionDoc3 =(TextView)findViewById(R.id.AdmisionDoc3);
        AdmisionDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(AdmisionActivity.this, Documento11.class);
                startActivity(Tab);
            }
        });
        AdmisionDoc4 =(TextView)findViewById(R.id.AdmisionDoc4);
        AdmisionDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(AdmisionActivity.this, Documento12.class);
                startActivity(Tab);
            }
        });

    }
}