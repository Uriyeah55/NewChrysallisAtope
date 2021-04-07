package com.example.newchrysallis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        LinearLayout menu=findViewById(R.id.linBotPrincipal);
        LinearLayout eventos=findViewById(R.id.linBotEventos);
        LinearLayout favoritos=findViewById(R.id.linBotFav);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(PerfilActivity.this, MenuActivity.class);
                startActivity(intentMenu);
            }
        });

        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEventos = new Intent(PerfilActivity.this, EventosActivity.class);
                startActivity(intentEventos);
            }
        });

        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPerfil = new Intent(PerfilActivity.this, FavActivity.class);
                startActivity(intentPerfil);
            }
        });

    }
}
