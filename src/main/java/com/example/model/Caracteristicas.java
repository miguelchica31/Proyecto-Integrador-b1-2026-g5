package com.example.model;

public class Caracteristicas {

    private long id;
    private String descripcion;

    public Caracteristicas(long id, String descripcion) {

        this.id = id;
        this.descripcion = descripcion;
    }

    public Caracteristicas(String descripcion) {
        this.descripcion = descripcion;
    }

    public Caracteristicas() {
    }
    
    public long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        @Override
    public String toString() {
        return "Caracteristicas [id=" + id + ", Descripción=" + descripcion +"]";
    }

}
