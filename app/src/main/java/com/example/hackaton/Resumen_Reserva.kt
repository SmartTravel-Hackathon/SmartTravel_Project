package com.example.hackaton
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class Resumen_Reserva : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resumen_reserva)
        val botonVolver = findViewById<ImageButton>(R.id.Buttonx1)

        botonVolver.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.buttonContinuar).setOnClickListener {
            startActivity(Intent (this, Detalles_Pago::class.java))
        }

    }
}