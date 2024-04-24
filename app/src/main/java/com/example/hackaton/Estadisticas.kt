package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Estadisticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        findViewById<ImageButton>(R.id.iconoHome).setOnClickListener{
            startActivity(Intent(this, AgregarPlan::class.java))
        }
        findViewById<ImageButton>(R.id.iconoAccount).setOnClickListener{
            startActivity(Intent(this, InformacionCuenta::class.java))
        }
        findViewById<Button>(R.id.buttonEstadisticas).setOnClickListener{
            startActivity(Intent(this, EstadisticaPorPlan::class.java))
        }
    }
}