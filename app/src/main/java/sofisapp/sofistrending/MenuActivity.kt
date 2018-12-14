package sofisapp.sofistrending

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnBoys.setOnClickListener {
            val intent = Intent(this, BoysActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Niños", Toast.LENGTH_SHORT).show()
        }

        btnDamas.setOnClickListener {
            val intent = Intent(this, DamasActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Damas", Toast.LENGTH_SHORT).show()
        }

        btnCaballeros.setOnClickListener {
            val intent = Intent(this, CaballerosActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Caballeros", Toast.LENGTH_SHORT).show()
        }

        tvInicio.setOnClickListener {
            finish()
        }

    }
}