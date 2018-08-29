package com.example.johnny.listapersonalizadas2;

public class Producto {
    String nommbre,descripcion,unidad;
    float precio;

    public Producto(String nommbre, String descripcion, String unidad, float precio) {
        this.nommbre = nommbre;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

