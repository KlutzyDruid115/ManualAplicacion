package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fabricantes extends AppCompatActivity {

    Button ButtonBackF;

    TextView PMercedez;
    TextView PMeritor;
    TextView PCPolomex;
    TextView PCBusscar;
    TextView PCAyco;
    TextView PLlantas;
    TextView PVoith;
    TextView PAireAcondicionado;
    TextView PWabco;
    TextView PZF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabricantes);

        ButtonBackF=(Button)findViewById(R.id.ButtonBackF);
        ButtonBackF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackF = new Intent(Fabricantes.this,GarantiaActivity.class);
                startActivity(ButtonBackF);
            }
        });

        PMercedez =(TextView)findViewById(R.id.PMercedez);
        PMercedez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PMercedezActivity.class);
                startActivity(Docs);
            }
        });

        PMeritor =(TextView)findViewById(R.id.PMeritor);
        PMeritor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PMeritor.class);
                startActivity(Docs);
            }
        });
        PCPolomex =(TextView)findViewById(R.id.PCPolomex);
        PCPolomex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaPolomex.class);
                startActivity(Docs);
            }
        });
        PCBusscar =(TextView)findViewById(R.id.PCBusscar);
        PCBusscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaBusscar.class);
                startActivity(Docs);
            }
        });
        PCAyco =(TextView)findViewById(R.id.PCAyco);
        PCAyco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaAyco.class);
                startActivity(Docs);
            }
        });
        PLlantas =(TextView)findViewById(R.id.PLlantas);
        PLlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaLlantas.class);
                startActivity(Docs);
            }
        });
        PVoith =(TextView)findViewById(R.id.PVoith);
        PVoith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaVoith.class);
                startActivity(Docs);
            }
        });
        PAireAcondicionado =(TextView)findViewById(R.id.PAireAcondicionado);
        PAireAcondicionado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaAireAcondcionado.class);
                startActivity(Docs);
            }
        });
        PWabco =(TextView)findViewById(R.id.PWabco);
        PWabco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaWabco.class);
                startActivity(Docs);
            }
        });
        PZF =(TextView)findViewById(R.id.PZF);
        PZF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(Fabricantes.this,PCarroceriaPZF.class);
                startActivity(Docs);
            }
        });

    }
}