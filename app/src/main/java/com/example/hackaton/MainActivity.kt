package com.example.hackaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonPruebaInicio = findViewById<Button>(R.id.button_inicio)
        val botonPruebaLogin = findViewById<Button>(R.id.button_login)
        val botonPruebaPantalla_Carga1= findViewById<Button>(R.id.button_carga)
        val botonPruebaRegistrarse_Turista = findViewById<Button>(R.id.button_registertourist)
        val botonPruebaRegistrarse_Agencia = findViewById<Button>(R.id.button_registeragency)

        val botonPruebaReservar_Carro = findViewById<Button>(R.id.button_Reserva_Carro)
        val botonPruebaDatos_viajero = findViewById<Button>(R.id.button_Datos_del_viajero)
        val botonPruebaResumen_reserva= findViewById<Button>(R.id.button_Resumen_Reserva)
        val botonPruebaPagar = findViewById<Button>(R.id.button_Pagar)
        val botonPruebaPantalla_Carga2 = findViewById<Button>(R.id.button_Carga2)


        val botonPrueba = findViewById<Button>(R.id.button)
        val botonPrueba2 = findViewById<Button>(R.id.button2)
        val botonPrueba3 = findViewById<Button>(R.id.button3)
        val botonPrueba4 = findViewById<Button>(R.id.button4)
        val botonPrueba5 = findViewById<Button>(R.id.button5)
        val botonPrueba6 = findViewById<Button>(R.id.button6)
        val botonPrueba7 = findViewById<Button>(R.id.button7)

        val botonHome = findViewById<Button>(R.id.buttonHome)
        val botonPerfil = findViewById<Button>(R.id.buttonPerfil)

        botonPruebaInicio.setOnClickListener {
            val intent = Intent (this, Inicio::class.java)
            startActivity(intent)
        }
        botonPruebaLogin.setOnClickListener {
            val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }
        botonPruebaPantalla_Carga1.setOnClickListener {
            val intent = Intent (this, Pantalla_Carga::class.java)
            startActivity(intent)
        }
        botonPruebaRegistrarse_Turista.setOnClickListener {
            val intent = Intent (this, Registrarse_Turista::class.java)
            startActivity(intent)
        }
        botonPruebaRegistrarse_Agencia.setOnClickListener {
            val intent = Intent (this, Registrarse_Agencia::class.java)
            startActivity(intent)
        }


        botonPruebaReservar_Carro.setOnClickListener {
            val intent = Intent (this, Reservar_Carro::class.java)
            startActivity(intent)
        }
        botonPruebaDatos_viajero.setOnClickListener {
            val intent = Intent (this, Datos_Viajero::class.java)
            startActivity(intent)
        }
        botonPruebaResumen_reserva.setOnClickListener {
            val intent = Intent (this, Resumen_Reserva::class.java)
            startActivity(intent)
        }
        botonPruebaPagar.setOnClickListener {
            val intent = Intent (this, Pagar::class.java)
            startActivity(intent)
        }
        botonPruebaPantalla_Carga2.setOnClickListener {
            val intent = Intent (this, Pantalla_Carga2::class.java)
            startActivity(intent)
        }







        botonPrueba.setOnClickListener {
            val intent = Intent (this, Filtro_Vuelos::class.java)
            startActivity(intent)
        }

        botonPrueba2.setOnClickListener {
            val intent = Intent (this, Ordenar_Por::class.java)
            startActivity(intent)
        }

        botonPrueba3.setOnClickListener {
            val intent = Intent (this, Detalles_Agencia::class.java)
            startActivity(intent)
        }

        botonPrueba4.setOnClickListener {
            val intent = Intent (this, Reserva_Hoteles::class.java)
            startActivity(intent)
        }

        botonPrueba5.setOnClickListener {
            val intent = Intent (this, Reserva_Restaurantes::class.java)
            startActivity(intent)
        }

        botonPrueba6.setOnClickListener {
            val intent = Intent (this, Detalles_Pago::class.java)
            startActivity(intent)
        }

        botonPrueba7.setOnClickListener {
            val intent = Intent (this, Notificaciones::class.java)
            startActivity(intent)
        }

        botonHome.setOnClickListener {
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }

        botonPerfil.setOnClickListener {
            val intent = Intent (this, Perfil::class.java)
            startActivity(intent)
        }

    }
}