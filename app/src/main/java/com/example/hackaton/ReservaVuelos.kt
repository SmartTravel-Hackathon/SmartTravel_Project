package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ReservaVuelos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva_vuelos)

        findViewById<ImageButton>(R.id.xButton).setOnClickListener {
            val intent = Intent (this, PersonalizarViaje::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.ordenar).setOnClickListener {
            val intent = Intent (this, Ordenar_Por::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.filtrar).setOnClickListener {
            val intent = Intent (this, Filtro_Vuelos::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.iconoMisViajes).setOnClickListener {
            startActivity(Intent (this, Viajes::class.java))
        }

        findViewById<ImageButton>(R.id.iconoAccount).setOnClickListener {
            startActivity(Intent (this, Perfil::class.java))
        }

        findViewById<Button>(R.id.iconoPlanes).setOnClickListener {
            startActivity(Intent(this, PlanesTuristicos::class.java))
        }

        findViewById<Button>(R.id.iconoHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<Button>(R.id.iconoNotificaciones).setOnClickListener {
            startActivity(Intent(this, Notificaciones::class.java))
        }
    }
}