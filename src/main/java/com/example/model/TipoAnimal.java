package com.example.model;

public class TipoAnimal {

    private long id;
    private String nombre;

    public TipoAnimal(long id, String nombre){

        this.id = id;
        this.nombre = nombre;

    }

    public TipoAnimal(String nombre){

        this.nombre = nombre;

    }

    public TipoAnimal(){

    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre +"]";
    }
}
