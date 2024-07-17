package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GarantiaMostradorActivity extends AppCompatActivity {

    Button ButtonBackGarantiaMostrador;
    TextView RefaccionesdeMostrador;
    TextView AnexoGarantiasMostrador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garantia_mostrador);

        ButtonBackGarantiaMostrador=(Button)findViewById(R.id.ButtonBackGarantiaMostrador);
        ButtonBackGarantiaMostrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackGarantiaMostrador = new Intent(GarantiaMostradorActivity.this,MainActivity.class);
                startActivity( ButtonBackGarantiaMostrador);
            }
        });

        RefaccionesdeMostrador =(TextView)findViewById(R.id.RefaccionesdeMostrador);
        RefaccionesdeMostrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(GarantiaMostradorActivity.this,Tabla2.class);
                startActivity(Tab);
            }
        });

        AnexoGarantiasMostrador =(TextView)findViewById(R.id.AnexoGarantiasMostrador);
        AnexoGarantiasMostrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(GarantiaMostradorActivity.this,Tabla3.class);
                startActivity(Tab);
            }
        });


    }
}