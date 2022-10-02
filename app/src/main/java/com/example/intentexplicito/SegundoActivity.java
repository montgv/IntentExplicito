package com.example.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.intentexplicito.databinding.ActivitySegundoBinding;

public class SegundoActivity extends AppCompatActivity {

    private ActivitySegundoBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle datos = getIntent().getExtras();
        int mat = datos.getInt("notaMat");
        int fis = datos.getInt("notaFis");
        int qui = datos.getInt("notaQui");
        int media = datos.getInt("media");

        binding.txtMat.setText("Nota de Matemáticas " + mat);
        binding.txtFis.setText("Nota de Física " + fis);
        binding.txtQui.setText("Nota de Química " + qui);

        if (media >= 5) {
            binding.txtResultado.setText("Aprobado con " + media + " de media");
        } else {
            binding.txtResultado.setText("Suspenso con " + media + " de media");
        }
    }
}