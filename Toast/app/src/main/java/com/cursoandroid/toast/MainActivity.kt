package com.cursoandroid.toast

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirToast(View: View){

        /*
        val imagem = ImageView(applicationContext)
        imagem.setImageResource(android.R.drawable.star_big_off)

        val textView = TextView(applicationContext)
        textView.text = "Olá!"

        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_LONG
        //toast.view = imagem
        */

        Toast.makeText(this,"Ação realizada com sucesso!",Toast.LENGTH_SHORT).show()
    }
}