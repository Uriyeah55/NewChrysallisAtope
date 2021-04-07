package com.example.newchrysallis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class EventosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_eventos);

        LinearLayout menu=findViewById(R.id.linBotPrincipal);
        LinearLayout favoritos=findViewById(R.id.linBotFav);
        LinearLayout perfil=findViewById(R.id.linBotPerfil);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(EventosActivity.this, MenuActivity.class);
                startActivity(intentMenu);
            }
        });

        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFavoritos = new Intent(EventosActivity.this, FavActivity.class);
                startActivity(intentFavoritos);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPerfil = new Intent(EventosActivity.this, PerfilActivity.class);
                startActivity(intentPerfil);
            }
        });
    }
}