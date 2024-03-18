package com.cursoandroid.calculadoragorjeta

import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editValor:EditText
    private lateinit var textPorcentagem:TextView
    private lateinit var textGorjeta:TextView
    private lateinit var textTotal:TextView
    private lateinit var seekBarGorjeta:SeekBar
    var porcentagem: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editValor = findViewById(R.id.editValor)
        textPorcentagem = findViewById(R.id.textPorcentagem)
        textGorjeta = findViewById(R.id.textGorjeta)
        textTotal = findViewById(R.id.textTotal)
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta)

        //Adicionar listener Seekbar
        seekBarGorjeta.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                porcentagem = progress.toDouble()
                textPorcentagem.text = "${Math.round(porcentagem)} %"
                calcular()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Código a ser executado quando o usuário começa a interagir com a SeekBar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Código a ser executado quando o usuário para de interagir com a SeekBar
            }
        })
    }

    fun calcular() {

        val valorRecuperado = editValor.text.toString()
        if (valorRecuperado == null || valorRecuperado.isEmpty()) {
            Toast.makeText(applicationContext,"Digite o valor da conta primeiro!",Toast.LENGTH_LONG).show()
        } else {
            // Converter string para double
            val valorDigitado = valorRecuperado.toDouble()

            // Calcular a gorjeta total
            val gorjeta = valorDigitado * (porcentagem / 100)
            val total = valorDigitado + gorjeta

            // Exibir a gorjeta e o total
            // textGorjeta.text = "R$ " + Math.round(gorjeta).toString()
            textGorjeta.text = "R$ $gorjeta"
            textTotal.text = "R$ $total"
        }
    }

}