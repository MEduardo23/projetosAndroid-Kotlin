package com.cursoandroid.atmconsultoria

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar:Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            enviarEmail()
        }

        val drawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        val navView:NavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_principal,
                R.id.nav_servico,
                R.id.nav_clientes,
                R.id.nav_contato,
                R.id.nav_sobre,
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun enviarEmail(){

        val celular = "tel:11977778888"
        val imagem = "https://imgmd.net/images/v1/guia/1620358/praia-vermelha-do-norte.jpg"
        val endereco = "https://www.google.com/maps/place/Parque+Villa-Lobos/@-23.5436244,-46.7268515,14.5z/data=!4m6!3m5!1s0x94ce56fa971a5e7d:0x6f6b8e0ec9daadd1!8m2!3d-23.5463088!4d-46.7253758!16s%2Fg%2F12301wb0?authuser=0&entry=ttu"

        // Criar uma Intent com a ação ACTION_SEND para enviar e-mail
        val intent = Intent(Intent.ACTION_SEND).apply {

            // Adicionar o endereço de e-mail de destino
            putExtra(Intent.EXTRA_EMAIL, arrayOf("edu.silva@gmail.com"))

            // Adicionar o assunto do e-mail
            putExtra(Intent.EXTRA_SUBJECT, "Contato pelo App")

            // Adicionar o corpo do e-mail
            putExtra(Intent.EXTRA_TEXT, "Corpo da mensagem")

            // Definir o tipo de conteúdo como "message/rfc822" para e-mails
            type = "message/rfc822"
        }

        startActivity(Intent.createChooser(intent, "Escolha um App para enviar o e-mail"))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}