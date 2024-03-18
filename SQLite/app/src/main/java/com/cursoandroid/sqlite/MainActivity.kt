package com.cursoandroid.sqlite

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criar o Database
        val bancoDados = openOrCreateDatabase("app", Context.MODE_PRIVATE, null)

        //Criar Tabela
        bancoDados.execSQL(
            "create table pessoas" +
                    "nome varchar(30)," +
                    "idade int(2)")

        //Inserir dados na Tabela
        bancoDados.execSQL("insert into pessoas (nome,idade) values('Matheus','40')")
        bancoDados.execSQL("insert into pessoas (nome,idade) values('Rebeca','35')")
    }
}