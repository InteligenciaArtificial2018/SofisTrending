package sofisapp.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_template_detalles.*

class DetallesBoy1Activity : AppCompatActivity() {

    var list: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template_detalles)

        val detalles = ArrayList<Detalles>()

        detalles.add(Detalles("Boy 1", "Prenda para niño",R.drawable.f))

        list = findViewById(R.id.rvLista)
        list?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        list?.layoutManager = layoutManager
/**
        adaptador = AdaptadorCustom(this detalles, object: ClickListener {
            override fun onClick(vista: View, index: Int) {
                Toast.makeText(applicationContext, detalles.get(index).titulo, Toast.LENGTH_SHORT).show()
            }
        }, object: LongClickListener {
            override fun LongClickListener(vista: View, index: Int) {
                Log.d("LONG", "Long listenersito")
            }
        })
        **/

        btnComprar.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        list?.adapter = adaptador



    }
}