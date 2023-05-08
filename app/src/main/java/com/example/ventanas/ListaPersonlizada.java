package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ventanas.modelo.Libro;
import com.example.ventanas.modelo.LibroAdaptador;

import java.util.ArrayList;

public class ListaPersonlizada extends AppCompatActivity {
    private ArrayList<Libro> libroLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personlizada);
        libroLista = new ArrayList<>();
        //getting string arrays from resource
        Resources res = getResources();
        // String[] todosLibros = {"uno","dos","tres"}
        String[] todosLibros = res.getStringArray(R.array.libros);
        // String[] todosAutores = {"autor1","autor2","autor3"}
        String[] todosAutores = res.getStringArray(R.array.autores);
        //popularesLibroLista(todosLibros, todosAutores);

        libroLista.add(new Libro(todosLibros[0],todosAutores[0],R.drawable.johnburke));
        libroLista.add(new Libro(todosLibros[1],todosAutores[1],R.drawable.fernandovillalobos));
        libroLista.add(new Libro(todosLibros[2],todosAutores[2],R.drawable.the_cokeville));
        libroLista.add(new Libro(todosLibros[3],todosAutores[3],R.drawable.colbert));
        libroLista.add(new Libro(todosLibros[4],todosAutores[4],R.drawable.carlosarroyo));


        LibroAdaptador adapter = new LibroAdaptador(getApplicationContext(),
                R.layout.list_item, libroLista);
        ListView listview = findViewById(R.id.libro_lista);
        listview.setAdapter(adapter);






    }

}
