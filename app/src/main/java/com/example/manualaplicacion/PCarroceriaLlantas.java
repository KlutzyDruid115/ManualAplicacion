package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento56;
import FabricantesDocumentacion.Documento6;

public class PCarroceriaLlantas extends AppCompatActivity {
    Button ButtonBackParteLLANTAS;
    TextView LlantasDoc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_llantas);

        ButtonBackParteLLANTAS = (Button) findViewById(R.id.ButtonBackParteLLANTAS);
        ButtonBackParteLLANTAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteLLANTAS = new Intent(PCarroceriaLlantas.this, Fabricantes.class);
                startActivity(ButtonBackParteLLANTAS);
            }
        });

        LlantasDoc1 =(TextView)findViewById(R.id.LlantasDoc1);
        LlantasDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(PCarroceriaLlantas.this, Documento56.class);
                startActivity(Tab);
            }
        });


    }
}