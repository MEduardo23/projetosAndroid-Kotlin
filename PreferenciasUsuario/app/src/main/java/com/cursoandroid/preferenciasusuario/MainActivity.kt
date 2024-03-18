package com.cursoandroid.preferenciasusuario

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSalvar: Button
    private lateinit var editNome: TextInputEditText
    private lateinit var textResultado: TextView

    companion object {
        private const val ARQUIVO_PREFERENCIA = "ArquivoPreferencia"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSalvar = findViewById(R.id.buttonSalvar)
        editNome = findViewById(R.id.editNome)
        textResultado = findViewById(R.id.textResultado)

        buttonSalvar.setOnClickListener {
            val preferences: SharedPreferences =
                getSharedPreferences(ARQUIVO_PREFERENCIA, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()

            // Validar nome
            if (editNome.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Preencha o seu nome", Toast.LENGTH_LONG).show()
            } else {
                val nome: String = editNome.text.toString()
                editor.putString("Nome", nome)
                editor.apply()
                textResultado.text = "Olá, $nome"
            }
        }

        // Recuperar dados salvos
        val preferences: SharedPreferences =
            getSharedPreferences(ARQUIVO_PREFERENCIA, Context.MODE_PRIVATE)

        // Valida se temos o nome em preferências
        if (preferences.contains("Nome")) {
            val nome: String = preferences.getString("Nome", "usuário não definido") ?: ""
            textResultado.text = "Olá, $nome"
        } else {
            textResultado.text = "Usuário não definido"
        }
    }
}
