package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PMercedezActivity extends AppCompatActivity {

    Button ButtonBackP;
    TextView ComponenteP1;
    TextView ComponenteP2;
    TextView ComponenteP3;
    TextView ComponenteP4;
    TextView ComponenteP5;
    TextView ComponenteP6;
    TextView ComponenteP7;
    TextView ComponenteP8;
    TextView ComponenteP9;
    TextView ComponenteP10;
    TextView ComponenteP11;
    TextView ComponenteP12;
    TextView ComponenteP13;
    TextView ComponenteP14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmercedez);

        ButtonBackP=(Button)findViewById(R.id.ButtonBackP);
        ButtonBackP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackP = new Intent(PMercedezActivity.this,Fabricantes.class);
                startActivity(ButtonBackP);
            }
        });
        ComponenteP1 =(TextView)findViewById(R.id.ComponenteP1);
        ComponenteP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,MotorActivity.class);
                startActivity(Docs);
            }
        });

        ComponenteP2 =(TextView)findViewById(R.id.ComponenteP2);
        ComponenteP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,RefriActivity.class);
                startActivity(Docs);
            }
        });

        ComponenteP3 =(TextView)findViewById(R.id.ComponenteP3);
        ComponenteP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,AdmisionActivity.class);
                startActivity(Docs);
            }
        });

        ComponenteP4 =(TextView)findViewById(R.id.ComponenteP4);
        ComponenteP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,CombustibleActivity.class);
                startActivity(Docs);
            }
        });

        ComponenteP5 =(TextView)findViewById(R.id.ComponenteP5);
        ComponenteP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,EscapeActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP6 =(TextView)findViewById(R.id.ComponenteP6);
        ComponenteP6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,BateriaActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP7 =(TextView)findViewById(R.id.ComponenteP7);
        ComponenteP7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,MarchaActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP8 =(TextView)findViewById(R.id.ComponenteP8);
        ComponenteP8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this, SistemaElectricoActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP9 =(TextView)findViewById(R.id.ComponenteP9);
        ComponenteP9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,TransmisionActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP10 =(TextView)findViewById(R.id.ComponenteP10);
        ComponenteP10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,DiferencialActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP11 =(TextView)findViewById(R.id.ComponenteP11);
        ComponenteP11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,EjesActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP12 =(TextView)findViewById(R.id.ComponenteP12);
        ComponenteP12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,SuspensionActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP13 =(TextView)findViewById(R.id.ComponenteP13);
        ComponenteP13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,SistemaAireActivity.class);
                startActivity(Docs);
            }
        });
        ComponenteP14 =(TextView)findViewById(R.id.ComponenteP14);
        ComponenteP14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Docs = new Intent(PMercedezActivity.this,DireccionActivity.class);
                startActivity(Docs);
            }
        });


    }
}