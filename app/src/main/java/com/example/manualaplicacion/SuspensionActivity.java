package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento40;
import FabricantesDocumentacion.Documento41;
import FabricantesDocumentacion.Documento6;

public class SuspensionActivity extends AppCompatActivity {

    Button ButtonBackSUSPENSIÓN;
    TextView SuspencionDoc1;
    TextView SuspencionDoc2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspension);

        ButtonBackSUSPENSIÓN=(Button)findViewById(R.id.ButtonBackSUSPENSIÓN);
        ButtonBackSUSPENSIÓN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackSUSPENSIÓN = new Intent(SuspensionActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackSUSPENSIÓN);
            }
        });

        SuspencionDoc1 =(TextView)findViewById(R.id.SuspencionDoc1);
        SuspencionDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SuspensionActivity.this, Documento40.class);
                startActivity(Tab);
            }
        });

        SuspencionDoc2 =(TextView)findViewById(R.id.SuspencionDoc2);
        SuspencionDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(SuspensionActivity.this, Documento41.class);
                startActivity(Tab);
            }
        });


    }
}