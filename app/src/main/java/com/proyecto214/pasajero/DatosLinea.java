package com.proyecto214.pasajero;
import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.File;
import java.util.ArrayList;


public class DatosLinea {

    final static ArrayList<DatosLinea> lineas = new ArrayList<>();
    final static ArrayList<DatosLinea> lineasFav = new ArrayList<>();

    int id;
    Linea linea;
    PolylineOptions ruta;
    ArrayList<MarkerOptions> paradas;
    Boolean checked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public PolylineOptions getRuta() {
        return ruta;
    }

    public void setRuta(PolylineOptions ruta) {
        this.ruta = ruta;
    }

    public ArrayList<MarkerOptions> getParadas() {
        return paradas;
    }

    public void addParada(MarkerOptions parada){
        this.paradas.add(parada);
    }

    public DatosLinea(Linea linea, PolylineOptions ruta, ArrayList<MarkerOptions> paradas) {
        this.linea = linea;
        this.ruta = ruta;
        this.paradas = paradas;
        this.checked = false;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }







}
