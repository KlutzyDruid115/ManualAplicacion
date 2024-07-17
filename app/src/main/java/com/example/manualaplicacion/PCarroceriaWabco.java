package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PCarroceriaWabco extends AppCompatActivity {
    Button ButtonBackParteWABCO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_wabco);

        ButtonBackParteWABCO = (Button) findViewById(R.id.ButtonBackParteWABCO);
        ButtonBackParteWABCO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteWABCO = new Intent(PCarroceriaWabco.this, Fabricantes.class);
                startActivity(ButtonBackParteWABCO);
            }
        });

    }
}