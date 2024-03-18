package com.cursoandroid.passandodados

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {

    private lateinit var textNome:TextView
    private lateinit var textIdade:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        textNome = findViewById(R.id.textNome)
        textIdade = findViewById(R.id.textIdade)

        //Recuperar os dados extras da Intent
        val extras:Bundle? = intent.extras

        //Verificando se ha dados extras
        if(extras != null){

            //Recuperando os dados de nome e idade do Bundle
            val nome = extras.getString("nome")
            val idade = extras.getInt("idade")

            // Exibindo os dados nas TextViews
            textNome.text = "Nome: $nome"
            textIdade.text = "Idade: $idade anos"
        }
    }
}