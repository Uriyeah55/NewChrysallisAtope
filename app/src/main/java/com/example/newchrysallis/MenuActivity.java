package com.example.newchrysallis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        LinearLayout eventos=findViewById(R.id.linBotEventos);
        LinearLayout favoritos=findViewById(R.id.linBotFav);
        LinearLayout perfil=findViewById(R.id.linBotPerfil);
        ListView llists= findViewById(R.id.llistaProva);

        //Evento[] listaEventos=getEventos();
        Evento[] listaEventos;

        EventoAdapter adapter=new EventoAdapter(listaEventos);

        // Set The Adapter
        llists.setAdapter(adapter);

        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEventos = new Intent(MenuActivity.this, EventosActivity.class);
                startActivity(intentEventos);
            }
        });

        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFavoritos = new Intent(MenuActivity.this, FavActivity.class);
                startActivity(intentFavoritos);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPerfil = new Intent(MenuActivity.this, PerfilActivity.class);
                startActivity(intentPerfil);
            }
        });
    }

    private ArrayList<Evento> getEventos(){
        Provincia prov=new Provincia(1, "Barcelona");
        Localidad loc= new Localidad(3, "Badalona",prov);
         ArrayList<Evento> evs= new ArrayList<Evento>();
         evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 23, 500, 63, loc));
return evs;

    }
}