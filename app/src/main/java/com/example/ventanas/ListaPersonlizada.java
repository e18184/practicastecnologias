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
        libroLista.add(new Libro(todosLibros[0],todosAutores[0],R.drawable.harry_potter));
        libroLista.add(new Libro(todosLibros[1],todosAutores[1],R.drawable.davinci_code));
        libroLista.add(new Libro(todosLibros[2],todosAutores[2],R.drawable.hunder_games));

        LibroAdaptador adapter = new LibroAdaptador(getApplicationContext(),
                R.layout.list_item, libroLista);
        ListView listview = findViewById(R.id.libro_lista);
        listview.setAdapter(adapter);






    }

    /*public void popularesLibroLista(String[]libros, String[]autores){
        libroLista.add(new Libro(libros[0],autores[0],R.drawable.davinci_code));
        libroLista.add(new Libro(libros[1],autores[1],R.drawable.girl_train));
        libroLista.add(new Libro(libros[2],autores[2],R.drawable.harry_potter));
        libroLista.add(new Libro(libros[3],autores[3],R.drawable.hunder_games));



    }*/
}
