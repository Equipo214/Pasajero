package com.proyecto214.pasajero;


public class Linea {
    private int id;
    private String linea;
    private String ramal;
    public Linea(String linea, String ramal) {
        super();
        this.linea = linea;
        this.ramal = ramal;
    }

    public String getLinea() {
        return linea;
    }

    public String getRamal() {
        return ramal;
    }

    public int getId(){return id;}

}