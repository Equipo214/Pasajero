package com.proyecto214.pasajero;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class LineasActivity extends AppCompatActivity  {

    ListView lineas;
    AdapterLineas adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineas);

        lineas = findViewById(R.id.lineas);


        adapter = new AdapterLineas(this, MainActivity.gDatos.getLineas() );
        lineas.setAdapter(adapter);

        lineas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                DatosLinea dl = DatosLinea.lineas.get(position);
                if( DatosLinea.lineasFav.contains(dl) != true ) {// Si no existe
                    DatosLinea.lineasFav.add(dl);  // creo
                     Snackbar.make( getWindow().getDecorView().findViewById(android.R.id.content)
                        , "ya existe: " + DatosLinea.lineasFav.contains(dl), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
                else{
                    Snackbar.make( getWindow().getDecorView().findViewById(android.R.id.content)
                            , "ya existe: " + DatosLinea.lineasFav.contains(dl), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                }
        });
    }
}

    /*
    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Importante");
        dialogo1.setMessage("¿ Acepta la ejecución de este programa en modo prueba ?");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }

    public void aceptar() {
        Toast t=Toast.makeText(this,"Bienvenido a probar el programa.", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cancelar() {
        finish();
    }
     */