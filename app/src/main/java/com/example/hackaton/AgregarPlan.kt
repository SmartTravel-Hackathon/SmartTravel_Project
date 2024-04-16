package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AgregarPlan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_plan)

        findViewById<Button>(R.id.buttonVerPlanes).setOnClickListener{
            startActivity(Intent(this, VerPlanes::class.java))
        }

        findViewById<Button>(R.id.iconoPlanes).setOnClickListener{
            startActivity(Intent(this, Estadisticas::class.java))
        }

        findViewById<Button>(R.id.iconoAccount).setOnClickListener{
            startActivity(Intent(this, InformacionCuenta::class.java))
        }
    }
}