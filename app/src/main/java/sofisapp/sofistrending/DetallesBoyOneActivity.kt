package sofisapp.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_detalles_boy_one.*

class DetallesBoyOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_boy_one)
        btnCarrito.setOnClickListener {
            val intent = Intent(this, DetallesBoyOneCarritoActivity::class.java)
            startActivity(intent)
        }
    }
}
