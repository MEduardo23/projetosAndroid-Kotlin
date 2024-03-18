package com.cursoandroid.toggleswitch

import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var toggleSenha:ToggleButton
    private lateinit var switchSenha:Switch
    private lateinit var textResultado:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleSenha = findViewById(R.id.toggleSenha)
        switchSenha = findViewById(R.id.switchSenha)
        textResultado = findViewById(R.id.textResultado)

        adicionarListener()
    }

    fun adicionarListener() {
        switchSenha.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textResultado.text = "ligado"
            } else {
                textResultado.text = "desligado"
            }
        }
    }


    fun enviar (View: View){
        if(switchSenha.isChecked){
            textResultado.text = "Switch ligado"
        } else{
            textResultado.text = "Switch desligado"
        }
    }
}