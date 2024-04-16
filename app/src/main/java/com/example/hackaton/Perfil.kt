package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val botonViajes = findViewById<ImageButton>(R.id.iconoMisViajes)
        val botonCuenta = findViewById<ImageButton>(R.id.iconoAccount)
        val botonHome = findViewById<ImageButton>(R.id.iconoHome)
        val botonPuntos = findViewById<ImageButton>(R.id.buttonPuntos)

        botonViajes.setOnClickListener {
            val intent = Intent (this, Viajes::class.java)
            startActivity(intent)
        }

        botonCuenta.setOnClickListener {
            val intent = Intent (this, Perfil::class.java)
            startActivity(intent)
        }

        botonHome.setOnClickListener {
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }

        botonPuntos.setOnClickListener {
            val intent = Intent (this, Puntos::class.java)
            startActivity(intent)
        }

    }
}