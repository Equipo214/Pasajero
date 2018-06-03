package com.proyecto214.pasajero;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LineasSelecActivity extends AppCompatActivity {



    AdapterLineas adapter;
    ListView lineas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineas_selec);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lineas = findViewById(R.id.lineasFav);


        adapter = new AdapterLineas(this, null );
        lineas.setAdapter(adapter);

        lineas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(LineasSelecActivity.this,
                        "ID: " + arrayLinea.get(position).getId(), Toast.LENGTH_SHORT)
                        .show();
                TextView tx = view.findViewById(R.id.Linea);

            }
        });
        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LineasSelecActivity.this, LineasActivity.class) );
            }
        });
    }

}
