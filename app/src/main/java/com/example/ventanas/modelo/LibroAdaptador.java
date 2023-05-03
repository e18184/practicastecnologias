package com.example.ventanas.modelo;

import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ventanas.R;

import java.util.ArrayList;
public class LibroAdaptador extends ArrayAdapter<Libro> {
    private ArrayList<Libro> libroLista;
    public LibroAdaptador(@NonNull Context context, int recurso, ArrayList<Libro> libroLista){
        super(context,recurso);
        this.libroLista = libroLista;
    }

    @NonNull
    @Override
    public View getView(int posicion, @Nullable View convectView, @NonNull ViewGroup parent) {
        int indice = posicion;
        if (convectView == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        ImageView libroImagen = convectView.findViewById(R.id.imagenView);
        TextView libroTitulo = convectView.findViewById(R.id.titulo_textview);
        TextView libroAutor = convectView.findViewById(R.id.autor_textview);

        libroImagen.setImageResource(libroLista.get(posicion).getLibroImagenId());
        libroTitulo.setText(libroLista.get(posicion).getLibroTitulo());
        libroAutor.setText(libroLista.get(posicion).getLibroAutor());
        return convectView;
    }

}
