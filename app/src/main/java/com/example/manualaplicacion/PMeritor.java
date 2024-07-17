package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento47;
import FabricantesDocumentacion.Documento6;

public class PMeritor extends AppCompatActivity {

    Button ButtonBackParteMeritor;

    TextView MeritorDoc1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmeritor);

        ButtonBackParteMeritor = (Button) findViewById(R.id.ButtonBackParteMeritor);
        ButtonBackParteMeritor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteMeritor = new Intent(PMeritor.this, Fabricantes.class);
                startActivity(ButtonBackParteMeritor);
            }
        });

        MeritorDoc1 =(TextView)findViewById(R.id.MeritorDoc1);
        MeritorDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PMeritor.this, Documento47.class);
                startActivity(Tab);
            }
        });


    }
}