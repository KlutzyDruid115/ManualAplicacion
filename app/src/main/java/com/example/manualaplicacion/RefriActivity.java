package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento1;
import FabricantesDocumentacion.Documento7;
import FabricantesDocumentacion.Documento8;

public class RefriActivity extends AppCompatActivity {

    Button ButtonBackRefrigeracion;
    TextView RefrigeracionDoc1;
    TextView RefrigeracionDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refri);


        ButtonBackRefrigeracion=(Button)findViewById(R.id.ButtonBackRefrigeracion);
        ButtonBackRefrigeracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackRefrigeracion = new Intent(RefriActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackRefrigeracion);
            }
        });

        RefrigeracionDoc1 =(TextView)findViewById(R.id.RefrigeracionDoc1);
        RefrigeracionDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(RefriActivity.this, Documento7.class);
                startActivity(Tab);
            }
        });

        RefrigeracionDoc2 =(TextView)findViewById(R.id.RefrigeracionDoc2);
        RefrigeracionDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(RefriActivity.this, Documento8.class);
                startActivity(Tab);
            }
        });



    }
}