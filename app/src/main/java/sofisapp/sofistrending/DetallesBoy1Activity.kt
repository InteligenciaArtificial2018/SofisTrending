package sofisapp.sofistrending

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast

class DetallesBoy1Activity : AppCompatActivity() {

    var list: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val detalles = ArrayList<Detalles>()

        detalles.add(Detalles("Boy 1", "Prenda para niño",R.drawable.boy1))

    }
}