package com.cursoandroid.snackbar

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAbrir:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById(R.id.buttonAbrir)

        buttonAbrir.setOnClickListener {
            Snackbar.make(
                it,
                "Botão pressionado",
                Snackbar.LENGTH_LONG
            ).setAction("Confirmar") {
                // Código a ser executado ao clicar na ação
                buttonAbrir.text = "Botão abrir alterado"
            }.setActionTextColor(resources.getColor(R.color.colorPrimary))
                .show()
        }

    }


}