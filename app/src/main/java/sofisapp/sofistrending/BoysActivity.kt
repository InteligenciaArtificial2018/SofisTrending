package sofisapp.sofistrending

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast

class BoysActivity:AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boys)

        val prendas = ArrayList<Prendas>()

        prendas.add(Prendas("Niños 1", 280.00,R.drawable.boy1))
        prendas.add(Prendas("Niños 2", 300.00,R.drawable.boy2))
        prendas.add(Prendas("Niños 3", 500.00,R.drawable.boy3))
        prendas.add(Prendas("Niños 4", 250.00,R.drawable.boy4))


        lista = findViewById(R.id.rvLista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, prendas, object: ClickListener {
            override fun onClick(vista: View, index: Int) {
                if (prendas.get(index).nombre == "Niños 1"){
                    val intent = Intent(applicationContext, DetallesBoy1Activity::class.java)
                    startActivity(intent)
                }
            }
        }, object: LongClickListener {
            override fun LongClickListener(vista: View, index: Int) {
                Log.d("LONG", "Long listenersito")
            }
        })

        lista?.adapter = adaptador


    }

}