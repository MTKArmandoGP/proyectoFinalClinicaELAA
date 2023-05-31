package com.example.clinicaelaa_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    Button btnRegistrar, btnIngresar;
    TextView olvidoContraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegistrar=findViewById(R.id.btnregistrar_login);
        olvidoContraseña=findViewById((R.id.tv_olvido_contrasena));
        btnIngresar=findViewById(R.id.btn_ingresar_login);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });

        olvidoContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),olvido_contrasena_activity.class);
                startActivity(intent);
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pantalla_principal_Doctores_activity.class);
                startActivity(intent);
            }
        });

    }
}