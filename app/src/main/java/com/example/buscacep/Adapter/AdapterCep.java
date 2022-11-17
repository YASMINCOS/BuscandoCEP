package com.example.buscacep.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buscacep.R;
import com.example.buscacep.model.Cep;

import java.util.ArrayList;
import java.util.List;

public class AdapterCep extends RecyclerView.Adapter<AdapterCep.CepViewHolder> {


    private List<Cep> cepList = new ArrayList<>();

    public AdapterCep(List<Cep> cepList) {
        this.cepList = cepList;
    }

    @NonNull
    @Override
    //criar anotacoes
    public CepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        itemLista = layoutInflater.inflate(R.layout.activity_main, parent, false);
        return new CepViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCep.CepViewHolder holder, int position) {

        holder.cep.setText(cepList.get(position).getCep());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CepViewHolder extends RecyclerView.ViewHolder {

        private TextView cep;

        public CepViewHolder(@NonNull View itemView) {
            super(itemView);


            cep = itemView.findViewById(R.id.salvarCep);
        }


    }
}
