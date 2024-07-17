package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento54;
import FabricantesDocumentacion.Documento55;
import FabricantesDocumentacion.Documento6;

public class PCarroceriaAyco extends AppCompatActivity {
    Button ButtonBackParteAyco;
    TextView AycoDoc1;
    TextView AycoDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_ayco);

        ButtonBackParteAyco = (Button) findViewById(R.id.ButtonBackParteAyco);
        ButtonBackParteAyco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteAyco = new Intent(PCarroceriaAyco.this, Fabricantes.class);
                startActivity(ButtonBackParteAyco);
            }
        });

        AycoDoc1 =(TextView)findViewById(R.id.AycoDoc1);
        AycoDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaAyco.this, Documento54.class);
                startActivity(Tab);
            }
        });

        AycoDoc2 =(TextView)findViewById(R.id.AycoDoc2);
        AycoDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaAyco.this, Documento55.class);
                startActivity(Tab);
            }
        });



    }
}