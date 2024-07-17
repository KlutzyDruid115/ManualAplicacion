package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import FabricantesDocumentacion.Documento1;
import FabricantesDocumentacion.Documento2;
import FabricantesDocumentacion.Documento3;
import FabricantesDocumentacion.Documento4;
import FabricantesDocumentacion.Documento5;
import FabricantesDocumentacion.Documento6;

public class MotorActivity extends AppCompatActivity {

    Button ButtonBackMotor;
    TextView MotorDoc1;
    TextView MotorDoc2;
    TextView MotorDoc3;
    TextView MotorDoc4;
    TextView MotorDoc5;
    TextView MotorDoc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);

        ButtonBackMotor=(Button)findViewById(R.id.ButtonBackMotor);
        ButtonBackMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBackMotor = new Intent(MotorActivity.this,PMercedezActivity.class);
                startActivity(ButtonBackMotor);
            }
        });
        MotorDoc1 =(TextView)findViewById(R.id.MotorDoc1);
        MotorDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento1.class);
                startActivity(Tab);
            }
        });

        MotorDoc2 =(TextView)findViewById(R.id.MotorDoc2);
        MotorDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento2.class);
                startActivity(Tab);
            }
        });

        MotorDoc3 =(TextView)findViewById(R.id.MotorDoc3);
        MotorDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento3.class);
                startActivity(Tab);
            }
        });

        MotorDoc4 =(TextView)findViewById(R.id.MotorDoc4);
        MotorDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento4.class);
                startActivity(Tab);
            }
        });

        MotorDoc5 =(TextView)findViewById(R.id.MotorDoc5);
        MotorDoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento5.class);
                startActivity(Tab);
            }
        });

        MotorDoc6 =(TextView)findViewById(R.id.MotorDoc6);
        MotorDoc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tab = new Intent(MotorActivity.this, Documento6.class);
                startActivity(Tab);
            }
        });




    }
}