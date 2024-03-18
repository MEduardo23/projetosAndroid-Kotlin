/*crie o seguinte codigo para uma pagina em kotlin no android studio: crie dois campos de
entrada de texto, um com titulo Gasolina/litro e outro com titulo Alcool/litro.
No primeiro campo, o usuario deve digitar o valor para o preco do litro da gasolina, e no segundo
o valor para o preco do litro do alcool.
Se o valor do litro do alcool for menor ou igual a 70% do valor do litro da gasolina,
devera exibir uma mensagem: "Abasteca com alcool". Senao, devera exibir uma mensagem: "Abasteca com gasolina"

usar os elementos de interface (EditText, Button, TextView)
sem fazer referencia a nenhum ID definido em arquivo XML
*/

package com.example.aula02

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextGasolina: EditText
    private lateinit var editTextAlcool: EditText
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextGasolina = findViewById(R.id.editTextGasolina)
        editTextAlcool = findViewById(R.id.editTextAlcool)
        textViewResultado = findViewById(R.id.textViewResultado)
    }

    fun verificarCombustivel(view: View) {

        //Recuperar os valores digitados
        val precoGasolina = editTextGasolina.text.toString().toDoubleOrNull()
        val precoAlcool = editTextAlcool.text.toString().toDoubleOrNull()

        //Validar se o usuario preencheu ou nao os campos
        if (precoGasolina != null && precoAlcool != null) {
            val percentual = precoAlcool / precoGasolina * 100

            if (percentual <= 70) {
                textViewResultado.text = "Abasteça com álcool"
            } else {
                textViewResultado.text = "Abasteça com gasolina"
            }
        } else {
            textViewResultado.text = "Por favor, preencha os campos com valores válidos."
        }
    }
}
