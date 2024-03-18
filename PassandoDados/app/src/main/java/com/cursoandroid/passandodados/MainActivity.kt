package com.cursoandroid.passandodados

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonEnviar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonEnviar = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener(View.OnClickListener {
            val segundaActivityIntent = Intent(this, SegundaActivity::class.java)

            //Passar dados entre as 2 Activities
            segundaActivityIntent.putExtra("nome","Matheus")
            segundaActivityIntent.putExtra("idade", 40)

            startActivity(segundaActivityIntent)
        })
    }
}