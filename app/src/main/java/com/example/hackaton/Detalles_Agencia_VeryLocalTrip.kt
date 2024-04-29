package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Detalles_Agencia_VeryLocalTrip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_agencia_very_local_trip)

        val botonVolver = findViewById<ImageButton>(R.id.xButton)

        botonVolver.setOnClickListener {
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}