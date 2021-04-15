package com.example.newchrysallis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class EventoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
        getSupportActionBar().hide();


       //SPINNER
        String[] arraySpinner = new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
        };
        Spinner s = (Spinner) findViewById(R.id.spinnerAsistentes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        //ENLACE
        TextView enlace=findViewById(R.id.EnlaceMaps);
        enlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4192?q=" + Uri.encode("Urquinaona 10, Barcelona"));

                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

                // Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);
            }
        });

        final ImageView imgCorazon=findViewById(R.id.btnApuntame);
        final boolean apuntado=false;
        final boolean favorito=false;
        final Button apuntame=findViewById(R.id.btnConfirmar);

        apuntame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!apuntado){
                    apuntame.setText("CANCELAR ASISTENCIA");
                }else{
                    apuntame.setText("CONFIRMAR ASISTENCIA");
                }
            }
        });

        imgCorazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!favorito){
                    imgCorazon.setImageResource(R.drawable.heartfull);
                }else{
                    imgCorazon.setImageResource(R.drawable.heartsilueta);
                }
            }
        });
    }
}
