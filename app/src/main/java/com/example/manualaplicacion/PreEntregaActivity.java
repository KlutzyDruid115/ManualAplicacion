package com.example.manualaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import actividades.SplashActivity;
import actividades.check.CheckOP1;
import actividades.check.CheckOP2;
import actividades.docs.DocOP1;
import actividades.docs.DocOP2;
import actividades.docs.DocOP3a4;


public class PreEntregaActivity extends AppCompatActivity {

    // IMPLEMENTAR LOS ELEMENTOS //
    Button ButtonBack1;


    //Documentos//
    TextView onDocOp1Click;
    TextView onDocOp2Click;
    TextView onDocOp3a4Click;
    TextView onDocOp4Click;

    // Checks //
    TextView onOp1Click;
    TextView onOp2Click;
    TextView onOp3Click;
    TextView onOp4Click;
    TextView onOp5Click;
    TextView onOp6Click;
    TextView onOp7Click;
    TextView onOp8Click;
    TextView onOp9Click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_entrega);


        // OPCIONES DE CHECKS OP//
        onOp1Click = (TextView) findViewById(R.id.Op1);
        onOp1Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp1Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp1Click);
            }
        });

        onOp2Click = (TextView) findViewById(R.id.Op2);
        onOp2Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp2Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp2Click);
            }
        });

        onOp3Click = (TextView) findViewById(R.id.Op3);
        onOp3Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp3Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp3Click);
            }
        });

        onOp4Click = (TextView) findViewById(R.id.Op4);
        onOp4Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp4Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp4Click);
            }
        });

        onOp5Click = (TextView) findViewById(R.id.Op5);
        onOp5Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp5Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp5Click);
            }
        });

        onOp6Click = (TextView) findViewById(R.id.Op6);
        onOp6Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp6Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp6Click);
            }
        });

        onOp7Click = (TextView) findViewById(R.id.Op7);
        onOp7Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp7Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp7Click);
            }
        });

        onOp8Click = (TextView) findViewById(R.id.Op8);
        onOp8Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp8Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp8Click);
            }
        });

        onOp9Click = (TextView) findViewById(R.id.Op9);
        onOp9Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onOp9Click = new Intent(PreEntregaActivity.this, CheckOP1.class);
                startActivity(onOp9Click);
            }
        });


        // OPCIONES DE DOCUMENTOS PDF//

        onDocOp1Click = (TextView) findViewById(R.id.DocOP1);
        onDocOp1Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onDocOp1Click = new Intent(PreEntregaActivity.this, DocOP1.class);
                startActivity(onDocOp1Click);
            }
        });

        onDocOp2Click = (TextView) findViewById(R.id.DocOP2);
        onDocOp2Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onDocOp2Click = new Intent(PreEntregaActivity.this, DocOP2.class);
                startActivity(onDocOp2Click);
            }
        });

        onDocOp3a4Click = (TextView) findViewById(R.id.DocOP3);
        onDocOp3a4Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onDocOp3a4Click = new Intent(PreEntregaActivity.this, DocOP3a4.class);
                startActivity(onDocOp3a4Click);
            }
        });

        onDocOp3a4Click = (TextView) findViewById(R.id.DocOP4);
        onDocOp3a4Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onDocOp3a4Click = new Intent(PreEntregaActivity.this, DocOP3a4.class);
                startActivity(onDocOp3a4Click);
            }
        });

        // BOTON PARA REGRESAR //

        ButtonBack1 = (Button) findViewById(R.id.ButtonBack1);
        ButtonBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ButtonBack1 = new Intent(PreEntregaActivity.this, MainActivity.class);
                startActivity(ButtonBack1);
            }
        });


    }
}
