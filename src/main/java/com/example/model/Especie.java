package com.example.model;

public class Especie {

    private long id_especie;
    private String nombre;
    private long id_tipo;
    private long id_alimentacion;

    public  Especie (long id_especie, String nombre, long id_tipo, long id_alimentacion){

        this.id_especie = id_especie;
        this.nombre = nombre;
        this.id_tipo = id_tipo;
        this.id_alimentacion = id_alimentacion;

    }

    public  Especie ( String nombre, long id_tipo, long id_alimentacion){

        this.nombre = nombre;
        this.id_tipo = id_tipo;
        this.id_alimentacion = id_alimentacion;

    }

    public Especie(){

    }

    


}
