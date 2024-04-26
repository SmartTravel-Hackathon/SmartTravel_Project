import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton.Detalles_Pago
import com.example.hackaton.R

class Pantalla_Carga2 : AppCompatActivity() {

    private val tiempoCarga: Long = 3000 // 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_carga2)

        Handler().postDelayed({
            // Código que se ejecutará después del tiempo de carga
            val intent = Intent(this, Detalles_Pago::class.java)
            startActivity(intent)
            finish() // Finaliza la actividad actual para que no se pueda regresar a ella
        }, tiempoCarga)
    }
}
