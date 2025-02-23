package com.example.sistema_solar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SistemaSolarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemasolar);

        // Obtener referencias a los ImageView de los planetas/sol
        ImageView sol = findViewById(R.id.sol);
        ImageView mercurio = findViewById(R.id.mercurio);
        ImageView venus = findViewById(R.id.venus);
        ImageView tierra = findViewById(R.id.tierra);
        ImageView luna = findViewById(R.id.luna);
        ImageView marte = findViewById(R.id.marte);
        ImageView jupiter = findViewById(R.id.jupiter);
        ImageView saturno = findViewById(R.id.saturno);
        ImageView urano = findViewById(R.id.urano);
        ImageView neptuno = findViewById(R.id.neptuno);


        // Configurar OnClickListeners para cada planeta/sol
        sol.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, SolActivity.class)));
        mercurio.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, MercurioActivity.class)));
        venus.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, VenusActivity.class)));
        tierra.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, TierraActivity.class)));
        luna.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, LunaActivity.class)));
        marte.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, MarteActivity.class)));
        jupiter.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, JupiterActivity.class)));
        saturno.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, SaturnoActivity.class)));
        urano.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, UranoActivity.class)));
        neptuno.setOnClickListener(v -> startActivity(new Intent(SistemaSolarActivity.this, NeptunoActivity.class)));

    }
}
