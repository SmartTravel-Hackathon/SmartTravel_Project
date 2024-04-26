package com.example.hackaton

import Pantalla_Carga2
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Pagar : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagar)

        val botonVolver = findViewById<ImageButton>(R.id.Buttonx1)

        botonVolver.setOnClickListener {
            val intent = Intent (this, Pantalla_Carga2::class.java)
            startActivity(intent)
        }

    }
}