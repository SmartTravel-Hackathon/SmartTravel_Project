package com.example.hackaton

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        findViewById<Button>(R.id.loginButtonTurista).setOnClickListener {
            startActivity(Intent (this, HomeActivity::class.java))
        }

        findViewById<Button>(R.id.loginButtonAgencia).setOnClickListener {
            startActivity(Intent (this, AgregarPlan::class.java))
        }

        findViewById<TextView>(R.id.textViewSignUp).setOnClickListener {
            startActivity(Intent (this, Registrarse_Turista::class.java))
        }

    }


}