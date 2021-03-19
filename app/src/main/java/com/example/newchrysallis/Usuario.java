package com.example.newchrysallis;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private int id;
    private int numSocio;
    private String nombre;
    private String apellidos;
    private String DNI;
    private Date fechaNacimiento;
    private Date fechaBaja;
    private String CP;
    private String direccion;
    private String telefono1;
    private String telefono2;
    private ArrayList<Menor> menores;
    private ArrayList<Evento> favoritos;
    private boolean aceptadoApp;
}
