package com.example.hackaton

import Pantalla_Carga2
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView
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
        val spinner = findViewById<Spinner>(R.id.spinnerCambioMoneda)
        var filtroSeleccionado = ""
        var valorDinero = findViewById<TextView>(R.id.textViewValorDinero)
        var valorDolares: Double = 100.0

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Obtener el valor seleccionado
                filtroSeleccionado = parent.getItemAtPosition(position).toString()
                // Convertir el valor según el filtro seleccionado
                var valorConvertido: Double = 0.0
                when (filtroSeleccionado) {
                    "Dólares" -> {
                        valorConvertido = valorDolares
                    }
                    "Pesos colombianos" -> {
                        // Conversión de dólares a pesos colombianos
                        valorConvertido = valorDolares * 3800 // Tasa de cambio de 1 USD a 3800 COP
                    }
                    "Colón costarricense" -> {
                        // Conversión de dólares a colones costarricenses
                        valorConvertido = valorDolares * 620 // Tasa de cambio de 1 USD a 620 CRC
                    }
                }

                // Actualizar el valor en el TextView
                valorDinero.text = valorConvertido.toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Acción opcional en caso de que no se seleccione nada
            }
        }

    }
}