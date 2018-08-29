package com.example.johnny.listaspersonalizadas;

public class Persona {
    String cedula,nommbre,direccion,telefono;
    int edad;

    public Persona(String cedula, String nommbre, String direccion, String telefono, int edad) {
        this.cedula = cedula;
        this.nommbre = nommbre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
