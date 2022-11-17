package com.example.buscacep;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.buscacep.Adapter.AdapterCep;
import com.example.buscacep.RecyclerViewClickListener.RecyclerViewClickListener;
import com.example.buscacep.databinding.ActivityMainBinding;
import com.example.buscacep.model.Cep;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    float returnResult;
    private static final int SECOND_ACTIVITY_RESQUEST_CODE = 0;

    private RecyclerView recycler;
    private List<Cep> cepList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addCep.setOnClickListener(this);
        recycler = (RecyclerView) binding.recyclevier;


        //formato da lista-layout Manager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false));

        //desempenho
        recycler.setHasFixedSize(true);
        //adapter
        AdapterCep adapterCep = new AdapterCep(cepList);
        recycler.setAdapter(adapterCep);



        if(getIntent().getSerializableExtra("cep") !=null){

            Intent intent = getIntent();

            Cep cep= (Cep) intent.getSerializableExtra("cep");

            ArrayList<Cep> eList = new ArrayList<>();
            eList.add(cep);
            recycler.setAdapter(adapterCep);
            adapterCep.notifyDataSetChanged();
        }


        //sugar


        //eventos de click

        recycler.addOnItemTouchListener(new RecyclerViewClickListener(
                getApplicationContext(),
                recycler,
                new  RecyclerViewClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Cep cep= cepList.get(position);

                        Toast.makeText(getApplicationContext(),"Cep" + cep.getCep(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                        Cep usuario= cepList.get(position);
                        Toast.makeText(getApplicationContext(),"Usuário" + usuario.getCep(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));
    }



    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.addCep){

            Intent intent = new Intent(MainActivity.this, ConsultarActivity.class);

            startActivity(intent);

        }

    }
}