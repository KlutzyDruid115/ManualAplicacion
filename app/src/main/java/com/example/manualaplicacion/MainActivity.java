package com.example.manualaplicacion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    private GridLayout gridLayout;
    private int currentIndex = 0;
    private int delayMillis = 100; // Ajusta el retraso entre cada card (en milisegundos)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INICIO ANIMACION //

        gridLayout = findViewById(R.id.gridLayout);

        // Mostrar la primera tarjeta e iniciar la animación
        showNextCardWithAnimation();

        // FIN ANIMACION //

        // ACTIVITY //

            // Obtén una referencia al LinearLayout con el ID "prentregaid"
            LinearLayout prentregaLayout = findViewById(R.id.prentregaid);

            // Agrega un OnClickListener al LinearLayout
            prentregaLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);

                    String mensaje = "Tienes 15 días hábiles para realizar tu trámite a partir de la fecha de la presente revisión.";
                    SpannableString spannableMensaje = new SpannableString(mensaje);
                    spannableMensaje.setSpan(new ForegroundColorSpan(Color.BLACK), 0, mensaje.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    String textoContinuar = "Continuar";
                    SpannableString spannableContinuar = new SpannableString(textoContinuar);
                    spannableContinuar.setSpan(new ForegroundColorSpan(Color.CYAN), 0, textoContinuar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    String textoCerrar = "Cerrar";
                    SpannableString spannableCerrar = new SpannableString(textoCerrar);
                    spannableCerrar.setSpan(new ForegroundColorSpan(Color.RED), 0, textoCerrar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    alerta.setMessage(spannableMensaje)
                            .setCancelable(false)
                            .setPositiveButton(spannableContinuar, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(MainActivity.this, PreEntregaActivity.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton(spannableCerrar, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });

                    AlertDialog titulo = alerta.create();
                    titulo.setTitle("Recordatorio Pre Entrega");
                    titulo.show();
                }
            });

            // Obtén una referencia al LinearLayout con el ID "servicioid"
            LinearLayout servicioLayout = findViewById(R.id.servicioid);

            // Agrega un OnClickListener al LinearLayout
            servicioLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);

                    String mensaje = "El trámite debe ser menor o igual a 5000 kms, si es mayor a 5000 kms, el tramite no aplica.";
                    SpannableString spannableMensaje = new SpannableString(mensaje);
                    spannableMensaje.setSpan(new ForegroundColorSpan(Color.BLACK), 0, mensaje.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    String textoContinuar = "Continuar";
                    SpannableString spannableContinuar = new SpannableString(textoContinuar);
                    spannableContinuar.setSpan(new ForegroundColorSpan(Color.CYAN), 0, textoContinuar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    String textoCerrar = "Cerrar";
                    SpannableString spannableCerrar = new SpannableString(textoCerrar);
                    spannableCerrar.setSpan(new ForegroundColorSpan(Color.RED), 0, textoCerrar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                    alerta.setMessage(spannableMensaje)
                            .setCancelable(false)
                            .setPositiveButton(spannableContinuar, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(MainActivity.this, KmsActivity.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton(spannableCerrar, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });

                    AlertDialog titulo = alerta.create();
                    titulo.setTitle("Recordatorio 500Kms");
                    titulo.show();
                }
            });

            // Obtén una referencia al LinearLayout con el ID "garantiasid"
            LinearLayout garantiasLayout = findViewById(R.id.garantiasid);
        // Agrega un OnClickListener al LinearLayout
        garantiasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se ejecutará cuando se haga clic en el LinearLayout
                // Inicia la nueva actividad
                Intent intent = new Intent(MainActivity.this, GarantiaActivity.class);
                startActivity(intent);
            }
        });

        // Obtén una referencia al LinearLayout con el ID "garantiasid"
        LinearLayout garantiasmostradorLayout = findViewById(R.id.GarantiasMostradorid);
        // Agrega un OnClickListener al LinearLayout
        garantiasmostradorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se ejecutará cuando se haga clic en el LinearLayout
                // Inicia la nueva actividad
                Intent intent = new Intent(MainActivity.this, GarantiaMostradorActivity.class);
                startActivity(intent);
            }
        });

        // Obtén una referencia al LinearLayout con el ID "Settings"
        LinearLayout settings = findViewById(R.id.settings);
        // Agrega un OnClickListener al LinearLayout
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se ejecutará cuando se haga clic en el LinearLayout
                // Inicia la nueva actividad
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        }

    private void animateCardsSequentially() {
        if (currentIndex < gridLayout.getChildCount()) {
            Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up);

            // Aplicar la animación a la vista actual
            gridLayout.getChildAt(currentIndex).startAnimation(slideUpAnimation);

            currentIndex++;

            // Llama al método recursivamente después del retraso
            Handler handler = new Handler();
            handler.postDelayed(this::animateCardsSequentially, delayMillis);
        }
    }
    private void showNextCardWithAnimation() {
        if (currentIndex < gridLayout.getChildCount()) {
            // Obtener la próxima tarjeta a animar
            android.view.View cardView = gridLayout.getChildAt(currentIndex);

            // Hacer la tarjeta visible antes de la animación
            cardView.setVisibility(android.view.View.VISIBLE);

            Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up);

            // Aplicar la animación a la tarjeta actual
            cardView.startAnimation(slideUpAnimation);

            currentIndex++;

            // Llamar al método recursivamente después del retraso
            Handler handler = new Handler();
            handler.postDelayed(this::showNextCardWithAnimation, delayMillis);
        }
    }
}