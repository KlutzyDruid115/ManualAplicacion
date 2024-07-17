package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PCarroceriaAireAcondcionado extends AppCompatActivity {

    Button ButtonBackParteAireAcondicionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcarroceria_aire_acondcionado);

        ButtonBackParteAireAcondicionado = (Button) findViewById(R.id.ButtonBackParteAireAcondicionado);
        ButtonBackParteAireAcondicionado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackParteAireAcondicionado = new Intent(PCarroceriaAireAcondcionado.this, Fabricantes.class);
                startActivity(ButtonBackParteAireAcondicionado);
            }
        });
    }
}