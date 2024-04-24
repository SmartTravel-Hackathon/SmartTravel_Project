package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EstadisticaPorPlan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadistica_por_plan)

        findViewById<Button>(R.id.xButton).setOnClickListener{
            startActivity(Intent(this, Estadisticas::class.java))
        }
    }
}