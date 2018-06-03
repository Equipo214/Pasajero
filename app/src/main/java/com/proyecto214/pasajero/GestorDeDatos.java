package com.proyecto214.pasajero;


import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.Arrays;

public class GestorDeDatos {
    private ArrayList<Linea> lineas;
    private ArrayList<Integer> lineasFav;
    private ArrayList<Parada> destinos;
    private boolean alarma;
    private boolean mostrarColectivos;
    private Parada destino;

    public boolean isMostrarColectivos() {
        return mostrarColectivos;
    }

    public void setMostrarColectivos(boolean mostrarColectivos) {
        this.mostrarColectivos = mostrarColectivos;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public ArrayList<Integer> getLineasFav() {
        return lineasFav;
    }

    public void setLineasFav(ArrayList<Integer> lineasFav) {
        this.lineasFav = lineasFav;
    }

    public boolean addLineasFav(Linea lineaFav) {
        int id = Arrays.asList(lineas).indexOf(lineaFav);
        if( !this.lineasFav.contains(id) ) {
            this.lineasFav.add(id);
            return true;
        }
        else
            return false;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public Parada getDestino() {
        return destino;
    }

    public void setDestino(Parada destino) {
        this.destino = destino;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }


     void cargarLineasTest(){

        PolylineOptions rectOptions = new PolylineOptions()
                .add(new LatLng(-34.763442, -58.388098),
                        new LatLng(-34.762534, -58.386596),
                        new LatLng(-34.765861, -58.384371),
                        new LatLng(-34.764240, -58.381203),
                        new LatLng(-34.769546, -58.377684)); // Closes the polyline.
        rectOptions.color(0x7F00FF00);

        ArrayList<MarkerOptions> arrayMarkerOptions = new ArrayList<>();
        arrayMarkerOptions.add(new MarkerOptions().position(new LatLng(-34.764240, -58.381203)).title("¿Donde esta mi bondi?"));
        Linea L = new Linea("4","Correo Central");
        this.lineas.add(L);

        lineas.add(new Linea("4","Balneario"));
        lineas.add(new Linea("266","1"));
        lineas.add(new Linea("266","2"));
        lineas.add(new Linea("266","3"));
        lineas.add(new Linea("266","4"));
        lineas.add(new Linea("318","1"));
        lineas.add(new Linea("318","2"));
        lineas.add(new Linea("318","3"));
        lineas.add(new Linea("338","4"));
        lineas.add(new Linea("338","1"));
        lineas.add(new Linea("338","2"));
        lineas.add(new Linea("338","3"));
        lineas.add(new Linea("406","Lomas de Zamora"));
        lineas.add(new Linea("406","Burzaco"));
        lineas.add(new Linea("406","San Jose"));
    }

    void cargarDatosBaseDeDatos(){
        lineas.clear();
        // conectarse
        // cargar
    }
}
