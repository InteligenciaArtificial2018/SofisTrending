package sofisapp.sofistrending

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class TemplateActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template_detalles)
        var tvNombre = findViewById<TextView>(R.id.tvTitulo)

        val nombre = intent.getStringExtra("nombre")
        tvNombre.text = nombre

    }
}