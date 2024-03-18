package com.cursoandroid.minhasanotacoes

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var preferencias: AnotacaoPreferencias
    private lateinit var editAnotacao: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editAnotacao = findViewById(R.id.editAnotacao)
        preferencias = AnotacaoPreferencias(applicationContext)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->

            // Validar se uma anotacao foi ou nao digitada, e salvar a anotacao
            val textoRecuperado = editAnotacao.text.toString()
            if(textoRecuperado.isEmpty()){
                Snackbar.make(view, "Preencha a anotação!", Snackbar.LENGTH_LONG).show()
            }
            else{
                preferencias.salvarAnotacao(textoRecuperado)
                Snackbar.make(view, "Anotação salva com sucesso!", Snackbar.LENGTH_LONG).show()
            }
        }
        // Recuperar a anotação
        val anotacao = preferencias.recuperarAnotacao()
        if(anotacao.isNotEmpty()){
            editAnotacao.setText(anotacao)
        }
    }
}