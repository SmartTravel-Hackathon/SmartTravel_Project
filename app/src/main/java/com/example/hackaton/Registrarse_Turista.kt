package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.TextView

class Registrarse_Turista :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrarse_turista)

        findViewById<RadioButton>(R.id.radio_agency).setOnClickListener {
            startActivity(Intent (this, Registrarse_Agencia::class.java))
        }

        findViewById<RadioButton>(R.id.radio_tourist).setOnClickListener {
            startActivity(Intent (this, Registrarse_Turista::class.java))
        }

        findViewById<Button>(R.id.button_register).setOnClickListener {
            startActivity(Intent (this, HomeActivity::class.java))
        }

        findViewById<TextView>(R.id.text_login).setOnClickListener {
            startActivity(Intent (this, Login::class.java))
        }
    }
}