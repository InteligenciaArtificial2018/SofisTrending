package sofisapp.sofistrending

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast

class DamasActivity:AppCompatActivity() {
    var lista: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_damas)

        val prendas = ArrayList<Prendas>()

        prendas.add(Prendas("Vershka", R.drawable.mujer1, 500.00))
        prendas.add(Prendas("Zara", R.drawable.mujer2, 1500.00))
        prendas.add(Prendas("Pull And Bear", R.drawable.mujer3, 3400.00))
        prendas.add(Prendas("Stradivarius", R.drawable.mujer4, 1200.00))





        lista = findViewById(R.id.rvLista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, prendas, object: ClickListener {
            override fun onClick(vista: View, index: Int) {
                Toast.makeText(applicationContext, prendas.get(index).nombre, Toast.LENGTH_SHORT).show()
            }
        }, object: LongClickListener {
            override fun LongClickListener(vista: View, index: Int) {
                Log.d("LONG", "Long listenersito")
            }
        })

        lista?.adapter = adaptador




    }
}
