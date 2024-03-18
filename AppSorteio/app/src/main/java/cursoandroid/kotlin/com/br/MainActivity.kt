package cursoandroid.kotlin.com.br

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sortearNumero(view: View) {

        val texto = findViewById<TextView>(R.id.textoResultado)
        val numero = Random().nextInt(11)

        texto.text = "Número: $numero"
    }

}