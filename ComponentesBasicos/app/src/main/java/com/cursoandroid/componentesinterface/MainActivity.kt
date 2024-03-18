package com.cursoandroid.componentesinterface

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var campoNome: EditText
    private lateinit var campoEmail: TextInputEditText
    private lateinit var textoResultado: TextView

    private lateinit var checkMlivre: CheckBox
    private lateinit var checkOlx: CheckBox
    private lateinit var checkShoppee: CheckBox

    private lateinit var sexoMasculino: RadioButton
    private lateinit var sexoFeminino: RadioButton
    private lateinit var opcaoSexo: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoNome = findViewById(R.id.editNome)
        campoEmail = findViewById(R.id.editEmail)
        textoResultado = findViewById(R.id.textoResultado)

        // Checkbox
        checkMlivre = findViewById(R.id.checkMlivre)
        checkOlx = findViewById(R.id.checkOlx)
        checkShoppee = findViewById(R.id.checkShoppee)

        //RadioButton
        sexoMasculino = findViewById(R.id.radioButtonMasculino)
        sexoFeminino = findViewById(R.id.radioButtonFeminino)
        opcaoSexo = findViewById(R.id.radioGroupSexo)
    }

    /*private fun checkbox() {
        var texto = ""

        if (checkMlivre.isChecked) {
            texto = "Mercado Livre selecionado - "
        }

        if (checkOlx.isChecked) {
            texto += "OLX selecionado - "
        }

        if (checkShoppee.isChecked) {
            texto += "Shoppee selecionado - "
        }

        textoResultado.text = texto
    }
*/
    private fun radiobutton(){


        if(sexoMasculino.isChecked){
            textoResultado.text = "Masculino"
        }else if (sexoFeminino.isChecked){
            textoResultado.text = "Feminino"
        }
    }

    fun enviar(view: View) {
        radiobutton()
        //checkbox()

        /*
        val nome = campoNome.text.toString()
        val email = campoEmail.text.toString()

        textoResultado.text = "nome: $nome email: $email"
         */
    }

    fun limpar(view: View) {
        campoNome.setText("")
        campoEmail.setText("")
    }
}
