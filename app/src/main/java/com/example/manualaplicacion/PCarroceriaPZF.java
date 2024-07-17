package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PCarroceriaPZF extends AppCompatActivity {
    Button ButtonBackParteZF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_pzf);


        ButtonBackParteZF = (Button) findViewById(R.id.ButtonBackParteZF);
        ButtonBackParteZF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteZF = new Intent(PCarroceriaPZF.this, Fabricantes.class);
                startActivity(ButtonBackParteZF);
            }
        });

    }
}