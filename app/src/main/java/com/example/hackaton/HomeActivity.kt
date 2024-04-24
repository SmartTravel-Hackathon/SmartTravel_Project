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

        findViewById<ImageButton>(R.id.botonVuelo).setOnClickListener {
            startActivity(Intent(this, PersonalizarViaje::class.java))
        }
        findViewById<ImageButton>(R.id.botonRestaurantes).setOnClickListener {
            startActivity(Intent(this, Reserva_Restaurantes::class.java))
        }
        findViewById<ImageButton>(R.id.botonHotel).setOnClickListener {
            startActivity(Intent(this, Reserva_Hoteles::class.java))
        }
        findViewById<ImageButton>(R.id.botonPlanes).setOnClickListener {
            startActivity(Intent(this, PlanesTuristicos::class.java))
        }
        findViewById<ImageButton>(R.id.botonTransporte).setOnClickListener {
            startActivity(Intent(this, Reservar_Carro::class.java))
        }
        findViewById<ImageButton>(R.id.botonAlojamiento).setOnClickListener {
            startActivity(Intent(this, Reserva_Hoteles::class.java))
        }
        findViewById<Button>(R.id.agencia1).setOnClickListener {
            startActivity(Intent(this, Detalles_Agencia::class.java))
        }
    }

}