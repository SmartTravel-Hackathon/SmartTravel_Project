package com.example.hackaton
/*Prueba*/
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Inicio : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        findViewById<ImageButton>(R.id.imageflecha).setOnClickListener {
            startActivity(Intent (this, Login::class.java))
        }

    }

}