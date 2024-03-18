package activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cursoandroid.fragments.R
import fragment.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var buttonConversas:Button
    private lateinit var buttonContatos:Button
    private lateinit var conversasFragment:ConversasFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conversasFragment = ConversasFragment()

        //Configurar um objeto para o Fragmento
        
    }
}