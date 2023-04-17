package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class acercade extends AppCompatActivity {
private TextView t_ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        t_ver = (TextView) findViewById(R.id.t_ver);

        Bundle bundle = getIntent().getExtras();
        t_ver.setText(bundle.getString("direccion"));
    }
    public void salir(View view){
        finish();
    }
}
