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

        prendas.add(Prendas("Niños 1", R.drawable.boy1))
        prendas.add(Prendas("Niños 2", R.drawable.boy1))
        prendas.add(Prendas("Niños 3", R.drawable.boy1))
        prendas.add(Prendas("Niños 4", R.drawable.boy1))



        lista = findViewById(R.id.rvLista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, prendas, object: ClickListener {
            override fun onClick(vista: View, index: Int) {
                if ( prendas.get(index).nombre == "Niños 2"){
                    val intent = Intent(applicationContext, CaballerosActivity::class.java)
                    startActivity(intent)
                }
                else if ( prendas.get(index).nombre == "Niños 3"){
                    val intent = Intent(applicationContext, DamasActivity::class.java)
                    startActivity(intent)
                }
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

