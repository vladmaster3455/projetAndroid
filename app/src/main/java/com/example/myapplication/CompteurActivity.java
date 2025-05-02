package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompteurActivity extends AppCompatActivity {

    private int compteur = 0;
    private TextView textCompteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);

        textCompteur = findViewById(R.id.textCompteur);
        Button btnIncrement = findViewById(R.id.buttonIncrement);
        Button btnReset = findViewById(R.id.buttonReset);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur++;
                textCompteur.setText(String.valueOf(compteur));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur = 0;
                textCompteur.setText(String.valueOf(compteur));
            }
        });
    }
}
