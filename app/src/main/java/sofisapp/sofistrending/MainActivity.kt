package sofisapp.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            //Toast.makeText(this, "Ingresando al menu", Toast.LENGTH_SHORT).show()


            //esta para ir a detalles cuando da click en una prenda de damas
            tvMenu.setOnClickListener {
                val intent = Intent(this, DetallesBoy1Activity::class.java)
                startActivity(intent)
                //Toast.makeText(this, "Ingresando a Detalles", Toast.LENGTH_SHORT).show()
            }


        }


    }
}
