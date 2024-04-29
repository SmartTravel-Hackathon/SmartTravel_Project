package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PlanesTuristicos2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planes_turisticos2)

        findViewById<ImageButton>(R.id.iconoHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<ImageButton>(R.id.filtrar).setOnClickListener {
            startActivity(Intent(this, Filtro_Planes::class.java))
        }

        findViewById<Button>(R.id.buttonPersonalizaViaje).setOnClickListener {
            startActivity(Intent(this, PersonalizarViaje::class.java))
        }

        findViewById<ImageButton>(R.id.iconoMisViajes).setOnClickListener {
            startActivity(Intent (this, Viajes::class.java))
        }

        findViewById<ImageButton>(R.id.iconoAccount).setOnClickListener {
            startActivity(Intent (this, Perfil::class.java))
        }

        findViewById<ImageButton>(R.id.iconoPlanes).setOnClickListener {
            startActivity(Intent(this, PlanesTuristicos::class.java))
        }

        findViewById<ImageButton>(R.id.iconoHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<ImageButton>(R.id.iconoNotificaciones).setOnClickListener {
            startActivity(Intent(this, Notificaciones::class.java))
        }


    }
}