package com.example.restaurantech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
    Button btnm1, btnm2, btnm3, btnm4, btnm5, btnm6, btnm7, btnm8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnm1 = (Button) findViewById(R.id.btn_m1);
        btnm2 = (Button) findViewById(R.id.btn_m2);
        btnm3 = (Button) findViewById(R.id.btn_m3);
        btnm4 = (Button) findViewById(R.id.btn_m4);
        btnm5 = (Button) findViewById(R.id.btn_m5);
        btnm6 = (Button) findViewById(R.id.btn_m6);
        btnm7 = (Button) findViewById(R.id.btn_m7);
        btnm8 = (Button) findViewById(R.id.btn_m8);

        btnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuUno.class);
                startActivity(i);
            }
        });

        btnm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuDos.class);
                startActivity(i);
            }
        });

        btnm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuTres.class);
                startActivity(i);
            }
        });

        btnm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuCuatro.class);
                startActivity(i);
            }
        });

        btnm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuCinco.class);
                startActivity(i);
            }
        });

        btnm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuSeis.class);
                startActivity(i);
            }
        });

        btnm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuSiete.class);
                startActivity(i);
            }
        });

        btnm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuOcho.class);
                startActivity(i);
            }
        });
    }
}
