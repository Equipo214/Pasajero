package com.proyecto214.pasajero;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.TooManyListenersException;


public class AdapterLineas extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Linea> lineas;

    public AdapterLineas(Activity activity, ArrayList<Linea> arrayLinea) {
        this.activity = activity;
        this.lineas = arrayLinea;
    }

    @Override
    public int getCount() {
        return lineas.size();
    }

    public void clear() {
        lineas.clear();
    }

    public void addAll(ArrayList<Linea> category) {
        for (int i = 0; i < category.size(); i++) {
            lineas.add(category.get(i));
        }
    }

    @Override
    public Object getItem(int arg0) {
        return lineas.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.linea_fila, null);
        }

        Linea vLinea = lineas.get(position);
        TextView linea = v.findViewById(R.id.Linea);
        linea.setText("Linea " + vLinea.getLinea());
        TextView ramal = v.findViewById(R.id.Ramal);
        ramal.setText("Ramal " + vLinea.getRamal());

        return v;
    }
}