package com.example.newchrysallis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    final  String NOMBREUSUARIO="1460770";
    final  String CONTRASENYA="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        final EditText usuario=findViewById(R.id.editUsuario);
        usuario.setText("");
        final EditText contrasenya=findViewById(R.id.editContra);
        contrasenya.setText("");
        final Button btoLogin=findViewById(R.id.btoLogin);
        final Switch swMantener=findViewById(R.id.switchInit);
        final TextView txt=findViewById(R.id.txtContra);

        ColorStateList oldColors =  txt.getTextColors();

        swMantener.setTextColor(oldColors);;

        btoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!usuario.getText().toString().equals("")&&!contrasenya.getText().toString().equals("")){
                   if(usuario.getText().toString().equals(NOMBREUSUARIO)&&contrasenya.getText().toString().equals(CONTRASENYA)) {
                       Intent intentLogin = new Intent(LoginActivity.this, MenuActivity.class);
                       startActivity(intentLogin);
                   }
                }else if(contrasenya.getText().toString().equals("")&&usuario.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Campos vacíos";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else if (usuario.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Usuario vacío";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else{
                    Context context = getApplicationContext();
                    CharSequence text = "Contraseña vacía";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        swMantener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cuando se pulsa switch
            }
        });
    }
}