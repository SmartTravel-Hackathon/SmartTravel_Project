package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.TextView

class Filtro_Planes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_planes)

        val seekBar = findViewById<SeekBar>(R.id.precios)
        val textView = findViewById<TextView>(R.id.valorSeekBar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textView.text = "Valor actual: $progress de ${seekBar?.max}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        findViewById<ImageButton>(R.id.xButton).setOnClickListener {
            startActivity(Intent(this, PlanesTuristicos::class.java))
        }

        findViewById<TextView>(R.id.limpiar).setOnClickListener {
            // Limpiar todos los RadioButtons
            limpiarRadioButtons()
        }

    }

    private fun limpiarRadioButtons() {

        // Desmarca todos los RadioButtons
        findViewById<RadioButton>(R.id.EstudiantesButton).isChecked = false
        findViewById<RadioButton>(R.id.FamiliasButton).isChecked = false
        findViewById<RadioButton>(R.id.NegociosButton).isChecked = false
        findViewById<RadioButton>(R.id.e4Button).isChecked = false
        findViewById<RadioButton>(R.id.e3Button).isChecked = false
        findViewById<RadioButton>(R.id.turisticosButton).isChecked = false
        findViewById<RadioButton>(R.id.aventuraButton).isChecked = false

    }


}