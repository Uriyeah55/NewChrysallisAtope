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
}
