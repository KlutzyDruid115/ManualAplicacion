package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento16;
import FabricantesDocumentacion.Documento17;
import FabricantesDocumentacion.Documento18;
import FabricantesDocumentacion.Documento19;
import FabricantesDocumentacion.Documento6;

public class EscapeActivity extends AppCompatActivity {

    Button ButtonBackEscape;
    TextView EscapeDoc1;
    TextView EscapeDoc2;
    TextView EscapeDoc3;
    TextView EscapeDoc4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);

        ButtonBackEscape=(Button)findViewById(R.id.ButtonBackEscape);
        ButtonBackEscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackEscape = new Intent(EscapeActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackEscape);
            }
        });
        EscapeDoc1 =(TextView)findViewById(R.id.EscapeDoc1);
        EscapeDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EscapeActivity.this, Documento16.class);
                startActivity(Tab);
            }
        });
        EscapeDoc2 =(TextView)findViewById(R.id.EscapeDoc2);
        EscapeDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EscapeActivity.this, Documento17.class);
                startActivity(Tab);
            }
        });
        EscapeDoc3 =(TextView)findViewById(R.id.EscapeDoc3);
        EscapeDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EscapeActivity.this, Documento18.class);
                startActivity(Tab);
            }
        });
        EscapeDoc4 =(TextView)findViewById(R.id.EscapeDoc4);
        EscapeDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(EscapeActivity.this, Documento19.class);
                startActivity(Tab);
            }
        });

    }
}