package com.sena.edu.entitis;

public class libros {
    public String nombre;
    public String autor;
    public int anioPublicacion;
    public String ISBN;
    public boolean estado;

    public libros(String nombre, String autor, int year, String iSBN, boolean estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioPublicacion = year;
        ISBN = iSBN;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
