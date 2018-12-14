package sofisapp.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agregar_item_carrito.*
import sofisapp.sofistrending.data.Carrito
import sofisapp.sofistrending.data.SofiasTrendingDatabase

class AgregarItemCarrito : AppCompatActivity() {

    private var sofiasTrendingDatabase: SofiasTrendingDatabase? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_item_carrito)

         sofiasTrendingDatabase = SofiasTrendingDatabase.getInstance(this)


        // Validar si se nos envía el intent con el valor del título
        val nombre = intent.getStringExtra("nombre")
        val cantidad = intent.getIntExtra("cantidad", 0)
        val precio = intent.getDoubleExtra("precio", 0.0)

        // Si no está definido o viene en blanco, el usuario presionó el FAB
        if (nombre == null || nombre == "") {

            btnAgregar.setOnClickListener {
                val carrito = Carrito(etNombre.text.toString(),  etCantidad.text.toString().toInt(), etPrecio.text.toString().toDouble())
                sofiasTrendingDatabase?.getCarritoDao()?.saveCarrito(carrito)
                finish()
            }
        } else {
            val id = intent.getIntExtra("id", 0)
            etNombre.setText(nombre)
            etCantidad.setText(cantidad.toString())
            etPrecio.setText(precio.toString())
            btnAgregar.setOnClickListener {
                val tarea = Carrito(etNombre.text.toString(),  etCantidad.text.toString().toInt(), etPrecio.text.toString().toDouble())
                tarea.id = id
                sofiasTrendingDatabase?.getCarritoDao()?.updateCarrito(tarea)
                startActivity(Intent(this, CarritoActivity::class.java))
                finish()
            }
        }
    }
}
