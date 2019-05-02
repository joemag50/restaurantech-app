package com.example.restaurantech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuUno extends AppCompatActivity implements View.OnClickListener{
    ImageView btnmenu;
    TextView a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_uno);

        btnmenu = findViewById(R.id.btn_menu);
        a = (TextView) findViewById(R.id.txv1);
        b = (TextView) findViewById(R.id.txv2);
        c = (TextView) findViewById(R.id.txv3);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.btnsnack1).setOnClickListener(this);
        findViewById(R.id.btnsnack2).setOnClickListener(this);
        findViewById(R.id.btnsnack3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnsnack1:
                if(a.getVisibility() == View.GONE)
                {
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                }else
                {
                    a.setVisibility(View.GONE);
                }
                break;
            case R.id.btnsnack2:
                if(b.getVisibility() == View.GONE)
                {
                    b.setVisibility(View.VISIBLE);
                    a.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                }else
                {
                    b.setVisibility(View.GONE);
                }
                break;
            case R.id.btnsnack3:
                if(c.getVisibility() == View.GONE)
                {
                    c.setVisibility(View.VISIBLE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                }else
                {
                    c.setVisibility(View.GONE);
                }
                break;

        }

    }
}
