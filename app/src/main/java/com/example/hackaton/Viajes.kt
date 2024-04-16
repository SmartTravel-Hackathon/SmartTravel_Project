package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Viajes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viajes)

        val botonCompletado = findViewById<Button>(R.id.buttonCompletado)
        val botonViajes = findViewById<ImageButton>(R.id.iconoMisViajes)
        val botonCuenta = findViewById<ImageButton>(R.id.iconoAccount)
        val botonHome = findViewById<ImageButton>(R.id.iconoHome)

        botonCompletado.setOnClickListener {
            val intent = Intent (this, Viajes_Completados::class.java)
            startActivity(intent)
        }

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

    }
}