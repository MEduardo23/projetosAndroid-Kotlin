package com.cursoandroid.caraoucoroa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    private lateinit var imageResultado:ImageView
    private lateinit var buttonVoltar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        imageResultado = findViewById(R.id.imageResultado)
        buttonVoltar = findViewById(R.id.buttonVoltar)

        //Recuperar Dados
        val dados = intent.extras
        val numero: Int = if (dados != null && dados.containsKey("numero")) {
            dados.getInt("numero")
        } else {
            0
        }

        if (numero == 0) { // Cara
            imageResultado.setImageResource(R.drawable.moeda_cara)
        } else { // Coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa)
        }

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}