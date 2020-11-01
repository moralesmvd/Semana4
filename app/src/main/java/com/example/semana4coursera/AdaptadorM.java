package com.example.semana4coursera;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorM extends RecyclerView.Adapter<AdaptadorM.MascotasViewHolder> {

    ArrayList<dataset> mascota;
    Activity activity;

    public AdaptadorM(ArrayList<dataset> mascota, Activity activity) {
        this.mascota = mascota;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new MascotasViewHolder(v);
    }

    @NonNull



    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder mascotasViewHolder, int position) {
        final dataset mascotas = mascota.get(position);
        mascotasViewHolder.nombre.setText(mascotas.getNombre());
        mascotasViewHolder.rating.setText(mascotas.getRating());
        mascotasViewHolder.perro.setImageResource(mascotas.getFoto());

    }

    @Override
    public int getItemCount() {
        return mascota.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre;
        private TextView rating;
        private ImageView perro;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.tvNombreCV);
            rating = (TextView) itemView.findViewById(R.id.tvRateCV);
            perro = (ImageView) itemView.findViewById(R.id.picdog);

        }
    }

}


