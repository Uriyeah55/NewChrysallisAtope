package com.example.newchrysallis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FavActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        LinearLayout menu=findViewById(R.id.linBotPrincipal);
        LinearLayout eventos=findViewById(R.id.linBotEventos);
        LinearLayout perfil=findViewById(R.id.linBotPerfil);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(FavActivity.this, MenuActivity.class);
                startActivity(intentMenu);
            }
        });

        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEventos = new Intent(FavActivity.this, EventosActivity.class);
                startActivity(intentEventos);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPerfil = new Intent(FavActivity.this, PerfilActivity.class);
                startActivity(intentPerfil);
            }
        });

    }
}
