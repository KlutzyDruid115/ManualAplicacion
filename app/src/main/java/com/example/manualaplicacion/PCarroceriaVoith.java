package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento57;
import FabricantesDocumentacion.Documento58;
import FabricantesDocumentacion.Documento6;

public class PCarroceriaVoith extends AppCompatActivity {
    Button ButtonBackParteVoith;
    TextView VoithDoc1;
    TextView VoithDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_voith);

        ButtonBackParteVoith = (Button) findViewById(R.id.ButtonBackParteVoith);
        ButtonBackParteVoith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteVoith = new Intent(PCarroceriaVoith.this, Fabricantes.class);
                startActivity(ButtonBackParteVoith);
            }
        });

        VoithDoc1 =(TextView)findViewById(R.id.VoithDoc1);
        VoithDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaVoith.this, Documento57.class);
                startActivity(Tab);
            }
        });

        VoithDoc2 =(TextView)findViewById(R.id.VoithDoc2);
        VoithDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaVoith.this, Documento58.class);
                startActivity(Tab);
            }
        });




    }
}