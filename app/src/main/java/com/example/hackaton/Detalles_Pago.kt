package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Detalles_Pago : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_pago)

        findViewById<TextView>(R.id.textVerDetallesPago).setOnClickListener {
            startActivity(Intent (this, Pagar::class.java))
        }
    }
}