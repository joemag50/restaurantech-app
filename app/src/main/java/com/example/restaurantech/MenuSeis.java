package com.example.restaurantech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuSeis extends AppCompatActivity implements View.OnClickListener {
    ImageView btnmenu;
    TextView a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seis);

        btnmenu = findViewById(R.id.btn_regresar);
        a = (TextView) findViewById(R.id.txv1);
        b = (TextView) findViewById(R.id.txv2);
        c = (TextView) findViewById(R.id.txv3);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button12:
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
            case R.id.button13:
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
            case R.id.button14:
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
