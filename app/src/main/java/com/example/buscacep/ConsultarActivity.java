package com.example.buscacep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.buscacep.model.Cep;
import com.orm.SugarConfig;

public class ConsultarActivity extends AppCompatActivity {

    private EditText editCep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        editCep = (EditText) findViewById(R.id.editConsultar);

        Button btSalvar = findViewById(R.id.salvarCep);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cep cep = new Cep(Integer.parseInt(editCep.getText().toString()));
                cep.save();
                Intent returnIntent = new Intent(ConsultarActivity.this,MainActivity.class);
                returnIntent.putExtra("cep", cep);
                startActivity(returnIntent);
                finish();


            }
        });


    }

    public void salvarDados(){


    }

}