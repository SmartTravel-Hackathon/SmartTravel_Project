package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Estadisticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        findViewById<Button>(R.id.iconoHome).setOnClickListener{
            startActivity(Intent(this, AgregarPlan::class.java))
        }
        findViewById<Button>(R.id.iconoAccount).setOnClickListener{
            startActivity(Intent(this, InformacionCuenta::class.java))
        }
    }
}