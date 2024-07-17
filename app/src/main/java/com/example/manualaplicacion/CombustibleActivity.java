package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento13;
import FabricantesDocumentacion.Documento14;
import FabricantesDocumentacion.Documento15;
import FabricantesDocumentacion.Documento6;

public class CombustibleActivity extends AppCompatActivity {

    Button ButtonBackCombustible;
    TextView CombustibleDoc1;
    TextView CombustibleDoc2;
    TextView CombustibleDoc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustible);

        ButtonBackCombustible=(Button)findViewById(R.id.ButtonBackCombustible);
        ButtonBackCombustible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackCombustible = new Intent(CombustibleActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackCombustible);
            }
        });

        CombustibleDoc1 =(TextView)findViewById(R.id.CombustibleDoc1);
        CombustibleDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(CombustibleActivity.this, Documento13.class);
                startActivity(Tab);
            }
        });
        CombustibleDoc2 =(TextView)findViewById(R.id.CombustibleDoc2);
        CombustibleDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(CombustibleActivity.this, Documento14.class);
                startActivity(Tab);
            }
        });
        CombustibleDoc3 =(TextView)findViewById(R.id.CombustibleDoc3);
        CombustibleDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(CombustibleActivity.this, Documento15.class);
                startActivity(Tab);
            }
        });

    }
}