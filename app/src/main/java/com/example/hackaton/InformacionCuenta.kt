package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InformacionCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_cuenta)

        findViewById<Button>(R.id.iconoPlanes).setOnClickListener{
            startActivity(Intent(this, Estadisticas::class.java))
        }

        findViewById<Button>(R.id.iconoHome).setOnClickListener{
            startActivity(Intent(this, AgregarPlan::class.java))
        }
    }
}