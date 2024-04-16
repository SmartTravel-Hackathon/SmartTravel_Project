package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val botonViajes = findViewById<ImageButton>(R.id.iconoMisViajes)
        val botonCuenta = findViewById<ImageButton>(R.id.iconoAccount)

        botonViajes.setOnClickListener {
            val intent = Intent (this, Viajes::class.java)
            startActivity(intent)
        }

        botonCuenta.setOnClickListener {
            val intent = Intent (this, Perfil::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.iconoPlanes).setOnClickListener {
            startActivity(Intent(this, PlanesTuristicos::class.java))
        }
    }

}