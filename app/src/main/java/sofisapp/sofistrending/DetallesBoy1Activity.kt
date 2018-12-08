package sofisapp.sofistrending

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast

class DetallesActivity : AppCompatActivity() {

    var list: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)


        val ropa = ArrayList<Prendas>()

        ropa.add(Prendas("Detalles", 280.00, R.drawable.mujer1))
        ropa.add(Prendas("Detalles", 300.00, R.drawable.mujer2))
        ropa.add(Prendas("Detalles", 500.00, R.drawable.mujer3))
        ropa.add(Prendas("Detalles", 250.00, R.drawable.mujer4))

        list = findViewById(R.id.rvLista)
        list?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        list?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, ropa, object : ClickListener {
            override fun onClick(vista: View, index: Int) {
                Toast.makeText(applicationContext, ropa.get(index).nombre, Toast.LENGTH_SHORT).show()
            }
        }, object : LongClickListener {
            override fun LongClickListener(vista: View, index: Int) {
                Log.d("LONG", "Long listenersito")
            }
        })

        list?.adapter = adaptador


    }
}