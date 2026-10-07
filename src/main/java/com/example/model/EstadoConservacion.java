package com.example.model;

public class EstadoConservacion {
    private long id_estado;
    private String nombre;

        public EstadoConservacion(long id_estado, String nombre) {
        this.id_estado = id_estado;
        this.nombre = nombre;
    }

    public EstadoConservacion(String nombre) {
        this.nombre = nombre;
    }

    public EstadoConservacion() {
    }
}
