package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText e_dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_dato = (EditText) findViewById(R.id.e_dato);
    }

    public void segundo(View view){
        Intent i = new Intent(this, acercade.class );
        i.putExtra("direccion",e_dato.getText().toString());


        startActivity(i);
    }

    public void tercero(View view) {
        Intent a = new Intent(this,terceractividad.class);
        startActivity(a);
        /*  esto es 17-4-2023 */
    }
    public void listapersonalizada (View view) {
        Intent b = new Intent(this,ListaPersonlizada.class);
        startActivity(b);


    }
}
