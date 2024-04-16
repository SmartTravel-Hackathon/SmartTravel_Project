package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PlanesTuristicos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planes_turisticos)

        findViewById<Button>(R.id.iconoHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<ImageButton>(R.id.filtrar).setOnClickListener {
            startActivity(Intent(this, Filtro_Planes::class.java))
        }

        findViewById<Button>(R.id.buttonPersonalizaViaje).setOnClickListener {
            startActivity(Intent(this, PersonalizarViaje::class.java))
        }


    }
}