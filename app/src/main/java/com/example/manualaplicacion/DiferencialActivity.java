package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento36;
import FabricantesDocumentacion.Documento37;
import FabricantesDocumentacion.Documento6;

public class DiferencialActivity extends AppCompatActivity {

    Button ButtonBackDIFERENCIAL;
    TextView DiferencialDoc1;
    TextView DiferencialDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diferencial);

        ButtonBackDIFERENCIAL=(Button)findViewById(R.id.ButtonBackDIFERENCIAL);
        ButtonBackDIFERENCIAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackDIFERENCIAL = new Intent(DiferencialActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackDIFERENCIAL);
            }
        });
        DiferencialDoc1 =(TextView)findViewById(R.id.DiferencialDoc1);
        DiferencialDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(DiferencialActivity.this, Documento36.class);
                startActivity(Tab);
            }
        });
        DiferencialDoc2 =(TextView)findViewById(R.id.DiferencialDoc2);
        DiferencialDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(DiferencialActivity.this, Documento37.class);
                startActivity(Tab);
            }
        });


    }
}