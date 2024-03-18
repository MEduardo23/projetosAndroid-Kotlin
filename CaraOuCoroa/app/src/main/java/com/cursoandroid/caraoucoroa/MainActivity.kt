package com.cursoandroid.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var buttonJogar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJogar = findViewById(R.id.buttonJogar)

        buttonJogar.setOnClickListener{

            val intent = Intent(this,ResultadoActivity::class.java)

            //Passar os dados do lado da moeda para a outra tela
            val numero = Random.Default.nextInt(2) // 0 ou 1, Cara ou Coroa
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}