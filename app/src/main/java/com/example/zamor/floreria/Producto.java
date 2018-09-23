package com.example.zamor.floreria;

public class Producto {
    private int image;
    private String nombre;
    private float costo;

    public Producto(int image, String nombre, float costo){
        this.costo = costo;
        this.nombre = nombre;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
