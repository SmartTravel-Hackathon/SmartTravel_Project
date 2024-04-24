package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InformacionCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_cuenta)

        findViewById<ImageButton>(R.id.iconoPlanes).setOnClickListener{
            startActivity(Intent(this, Estadisticas::class.java))
        }

        findViewById<ImageButton>(R.id.iconoHome).setOnClickListener{
            startActivity(Intent(this, AgregarPlan::class.java))
        }

        findViewById<Button>(R.id.button_cerrar_sesion).setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }
    }
}