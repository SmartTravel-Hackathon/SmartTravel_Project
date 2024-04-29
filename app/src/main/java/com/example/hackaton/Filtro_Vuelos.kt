package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast

class Filtro_Vuelos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_vuelos)

        val botonVolver = findViewById<ImageButton>(R.id.xButton)

        botonVolver.setOnClickListener {
            val intent = Intent (this, ReservaVuelos::class.java)
            startActivity(intent)
        }


        // Dependiendo del vuelo seleccionado envia a un lugar...
        val aviancaButton = findViewById<RadioButton>(R.id.aviancaButton)
        val copaButton = findViewById<RadioButton>(R.id.copaButton)
        val latamButton = findViewById<RadioButton>(R.id.latamButton)
        val wingoButton = findViewById<RadioButton>(R.id.wingoButton)

        aviancaButton.setOnClickListener {
            //showToast("Avianca selected")
            val intent = Intent (this, VuelosAvianca::class.java)
            startActivity(intent)
        }

        copaButton.setOnClickListener {
            //showToast("Copa selected")
        }

        latamButton.setOnClickListener {
            //showToast("Latam selected")
        }

        wingoButton.setOnClickListener {
            //showToast("Wingo selected")
            val intent = Intent (this, VuelosWingo::class.java)
            startActivity(intent)
        }


    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}
