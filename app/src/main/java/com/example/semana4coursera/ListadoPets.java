package com.example.semana4coursera;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListadoPets extends AppCompatActivity{

        private ArrayList<dataset> mascotas;
        private RecyclerView listaMascotas;
        Toolbar toolbar;
        private TextView titleToolbar;



    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotalst);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas1);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

        public AdaptadorM adaptador;
        public void inicializarAdaptador(){
        adaptador = new AdaptadorM (mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

        public void inicializarListaMascotas(){
        mascotas = new ArrayList<dataset>();

        mascotas.add(new dataset("Maggie","3",R.drawable.meme1));
        mascotas.add(new dataset("Frida","4",R.drawable.meme2));
        mascotas.add(new dataset("Paolo","4",R.drawable.gato1));
        mascotas.add(new dataset("Adolfo","4",R.drawable.gato2));
        mascotas.add(new dataset("Milu","4",R.drawable.cat3));
    }


}
