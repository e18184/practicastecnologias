package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class listview extends AppCompatActivity {
ListView lista;
ArrayList listaintermedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lista = findViewById(R.id.l_lista);
        listaintermedia = new ArrayList<String>();
        listaintermedia.add("uno");
        listaintermedia.add("dos");
        listaintermedia.add("tres");
        listaintermedia.add("cuatro");
        listaintermedia.add("cinco");
        listaintermedia.add("seis");
        /*paso intermedio ArrayAdapter*/
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaintermedia);
        lista.setAdapter(adaptador);

    }
    public void salir(View view){
        finish();
    }

}
