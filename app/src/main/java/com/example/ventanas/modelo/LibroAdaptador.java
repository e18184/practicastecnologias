package com.example.ventanas.modelo;

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
        super(context,recurso,libroLista);
        this.libroLista = libroLista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        ImageView bookImage = convertView.findViewById(R.id.libro_imageview);
        TextView titleTextView = convertView.findViewById(R.id.titulo_textview);
        TextView authorTextView = convertView.findViewById(R.id.autor_textview);

        bookImage.setImageResource(libroLista.get(position).getLibroImagenId());
        titleTextView.setText(libroLista.get(position).getLibroTitulo());
        authorTextView.setText(libroLista.get(position).getLibroAutor());

        return convertView;
    }


}
