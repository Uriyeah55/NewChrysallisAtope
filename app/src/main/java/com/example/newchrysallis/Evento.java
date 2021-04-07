package com.example.newchrysallis;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {

    private  int id;
    private  String nombre;
    private  String tipo;
    private Date fecha;
    //private Datetime hora;
    private  int imagen;
    private  float precio;
    private  int numeroAforo;
    private  int aforo;
    private Localidad localidad;

    public Evento(int id, String nombre, String tipo, float precio, int numeroAforo, int aforo, Localidad localidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.numeroAforo = numeroAforo;
        this.aforo = aforo;
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroAforo() {
        return numeroAforo;
    }

    public void setNumeroAforo(int numeroAforo) {
        this.numeroAforo = numeroAforo;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
