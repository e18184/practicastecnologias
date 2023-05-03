package com.example.ventanas.modelo;

public class Libro {
    private String libroTitulo;
    private String libroAutor;
    private int libroImagenId;

    public Libro(String libroTitulo, String libroAutor, int libroImagenId) {
        this.libroTitulo = libroTitulo;
        this.libroAutor = libroAutor;
        this.libroImagenId = libroImagenId;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    public String getLibroAutor() {
        return libroAutor;
    }

    public void setLibroAutor(String libroAutor) {
        this.libroAutor = libroAutor;
    }

    public int getLibroImagenId() {
        return libroImagenId;
    }

    public void setLibroImagenId(int libroImagenId) {
        this.libroImagenId = libroImagenId;
    }
}
