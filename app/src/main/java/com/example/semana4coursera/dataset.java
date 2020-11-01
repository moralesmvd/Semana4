package com.example.semana4coursera;

public class dataset {
    private String rating;
    private String nombre;
    private int foto;

    public dataset(String nombre, String rating, int foto) {
        this.nombre = nombre;
        this.rating = rating;
        this.foto = foto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String raiting) {
        this.rating = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}


