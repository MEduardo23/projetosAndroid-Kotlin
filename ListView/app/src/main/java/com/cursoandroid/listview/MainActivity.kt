package com.cursoandroid.listview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listLocais: ListView
    val itens = arrayOf(
        "São Paulo",
        "Rio de Janeiro",
        "Belo Horizonte",
        "Salvador",
        "Brasília",
        "Fortaleza",
        "Curitiba",
        "Recife",
        "Porto Alegre",
        "Manaus",
        "Belém",
        "Goiânia",
        "Vitória",
        "Florianópolis",
        "Natal",
        "João Pessoa",
        "Campo Grande",
        "Cuiabá",
        "São Luís",
        "Teresina"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listLocais = findViewById(R.id.listLocais)

        //Criar Adaptador para a lista
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            itens
        )

        listLocais.adapter = adapter

        //Adicionar clique na lista
        listLocais.setOnItemClickListener { adapterView: AdapterView<*>, view: View, i: Int, l: Long ->
            val indice = i
            val valorClicado = listLocais.getItemAtPosition(indice).toString()

            //Exibir mensagem na tela
            Toast.makeText(applicationContext, valorClicado, Toast.LENGTH_LONG).show()
        }
    }
}