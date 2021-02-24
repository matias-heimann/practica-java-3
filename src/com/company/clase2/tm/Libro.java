package com.company.clase2.tm;

public class Libro {

    private String titulo;
    private int isbn;
    private String autor;

    public Libro() {
        this.titulo = "";
        this.isbn = 0;
        this.autor = "";
    }

    public Libro(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(Libro libro) {
        this.titulo = libro.titulo;
        this.isbn = libro.isbn;
        this.autor = libro.autor;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
