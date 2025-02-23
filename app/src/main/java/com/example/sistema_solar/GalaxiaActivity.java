// GalaxiaActivity.java
package com.example.sistema_solar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GalaxiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxia);

        ImageView galaxiaImageView = findViewById(R.id.galaxiaImageView);

        galaxiaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalaxiaActivity.this, SistemaSolarActivity.class);
                startActivity(intent);
            }
        });
    }
}