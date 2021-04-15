package com.example.newchrysallis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    final  String NOMBREUSUARIO="Admin";
    final  String CONTRASENYA="Admin";
    final String VISIBLE=null;
    final TransformationMethod INVISIBLE=new PasswordTransformationMethod();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        final EditText usuario=findViewById(R.id.editUsuario);
        usuario.setText("");
        final EditText contrasenya=findViewById(R.id.editContra);
        contrasenya.setText("");
        //contrasenya.setLongClickable(false);
        final Button btoLogin=findViewById(R.id.btoLogin);
        final Switch swMantener=findViewById(R.id.switchInit);
        //final TextView txt=findViewById(R.id.verPassw);

        //final LinearLayout ver=findViewById(R.id.linPassw);
        final CheckBox verPassw=findViewById(R.id.checkVerPassw);
        //ColorStateList oldColors =  txt.getTextColors();
        //swMantener.setTextColor(oldColors);

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

        verPassw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText editcontra=findViewById(R.id.editContra);
                if(verPassw.isChecked()){
                    editcontra.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    editcontra.setSelection(editcontra.length());
                }else{
                    editcontra.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    editcontra.setSelection(editcontra.length());
                }

            }
        });
    }
}