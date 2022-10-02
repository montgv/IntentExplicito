package com.example.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.intentexplicito.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btEvaluar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int valor1 = Integer.parseInt(binding.txtMatematicas.getText().toString());
        int valor2 = Integer.parseInt(binding.txtFisica.getText().toString());
        int valor3 = Integer.parseInt(binding.txtQuimica.getText().toString());

        int media = (valor1 + valor2 + valor3) / 3;

        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtra("notaMat", valor1);
        intent.putExtra("notaFis", valor2);
        intent.putExtra("notaQui", valor3);
        intent.putExtra("media", media);
        startActivity(intent);
    }
}