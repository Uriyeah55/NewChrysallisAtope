package com.example.newchrysallis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        getSupportActionBar().hide();

        LinearLayout eventos=findViewById(R.id.linBotEventos);
        LinearLayout favoritos=findViewById(R.id.linBotFav);
        LinearLayout perfil=findViewById(R.id.linBotPerfil);
        ListView llista= findViewById(R.id.llistaProva);

        ArrayList<Evento> listaEventos= getEventos();
        EventoAdapter adapter=new EventoAdapter(this,listaEventos);

        // Set The Adapter
        llista.setAdapter(adapter);

        llista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent evento=new Intent(MenuActivity.this,EventoActivity.class);
                startActivity(evento);
            }
        });


        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEventos = new Intent(MenuActivity.this, MisEventosActivity.class);
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
         evs.add(new Evento(1,"Manifestació", "jaj", 0, 500, 63, loc));
        evs.add(new Evento(1,"Colònies", "jaj", 0, 500, 6, loc));
        evs.add(new Evento(1,"Curs", "jaj", 23, 50, 49, loc));
        evs.add(new Evento(1,"Colònies", "jaj", 23, 500, 12, loc));
        evs.add(new Evento(1,"Manifa", "jaj", 0, 500, 22, loc));
        evs.add(new Evento(1,"Manifestació", "jaj", 23, 500, 11, loc));
        evs.add(new Evento(1,"Curs", "jaj", 23, 500, 78, loc));
        evs.add(new Evento(1,"Manifestació", "jaj", 23, 500, 89, loc));
        evs.add(new Evento(1,"Manifestació", "jaj", 0, 500, 60, loc));
        evs.add(new Evento(1,"Colònies", "jaj", 23, 500, 499, loc));
        evs.add(new Evento(1,"Colònies", "jaj", 23, 500, 499, loc));
        evs.add(new Evento(1,"Curs", "jaj", 0, 50, 47, loc));
        evs.add(new Evento(1,"Curs", "jaj", 23, 50, 49, loc));
return evs;

    }
}