package com.cursoandroid.minhasanotacoes

import android.content.Context
import android.content.SharedPreferences

class AnotacaoPreferencias(private val context: Context) {

    private val NOME_ARQUIVO = "anotacao.preferencias"
    private val preferences: SharedPreferences = context.getSharedPreferences(NOME_ARQUIVO, 0)

    private val editor: SharedPreferences.Editor = preferences.edit()
    private val CHAVE_NOME = "nome"

    fun salvarAnotacao(anotacao: String){
        editor.putString(CHAVE_NOME, anotacao)
        editor.apply()
    }

    fun recuperarAnotacao(): String{
        return preferences.getString(CHAVE_NOME, "") ?: ""
    }
}