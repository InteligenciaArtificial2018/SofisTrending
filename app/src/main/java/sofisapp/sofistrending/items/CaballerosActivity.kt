package sofisapp.sofistrending.items

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast
import sofisapp.sofistrending.click_listener.ClickListener
import sofisapp.sofistrending.click_listener.LongClickListener
import sofisapp.sofistrending.modelos.Prendas
import sofisapp.sofistrending.R
import sofisapp.sofistrending.adaptadores.AdaptadorCustom

class CaballerosActivity:AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caballeros)



        val prendas = ArrayList<Prendas>()

        prendas.add(Prendas("Nautica", 900.00, R.drawable.hombre1))
        prendas.add(Prendas("Tomy", 4300.00, R.drawable.hombre2))
        prendas.add(Prendas("Hugo Boss", 1200.00, R.drawable.hombre3))
        prendas.add(Prendas("Stealth", 700.00, R.drawable.hombre4))


        lista = findViewById(R.id.rvLista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, prendas, object : ClickListener {
            override fun onClick(vista: View, index: Int) {
                Toast.makeText(applicationContext, prendas.get(index).nombre, Toast.LENGTH_SHORT).show()
            }
        }, object : LongClickListener {
            override fun LongClickListener(vista: View, index: Int) {
                Log.d("LONG", "Long listenersito")
            }
        })

        lista?.adapter = adaptador

    }

}