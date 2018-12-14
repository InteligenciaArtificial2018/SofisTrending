package sofisapp.sofistrending


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_carrito.*
import sofisapp.sofistrending.data.Carrito
import sofisapp.sofistrending.data.SofiasTrendingDatabase

class CarritoActivity : AppCompatActivity(), CarritoAdapter.OnItemCarritoClickListener {

    private var sofiasTrendingDatabase: SofiasTrendingDatabase? = null
    private var carritoAdapter: CarritoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        sofiasTrendingDatabase = SofiasTrendingDatabase.getInstance(this)
        carritoAdapter = CarritoAdapter(sofiasTrendingDatabase?.getCarritoDao()?.getListCarrito())
        carritoAdapter?.setItemCarritoClickListener(this)

    }

    override fun onResume() {
        super.onResume()
        carritoAdapter?.listaCarrito = sofiasTrendingDatabase?.getCarritoDao()?.getListCarrito()
        RvCarrito.adapter = carritoAdapter
        RvCarrito.layoutManager = LinearLayoutManager(this)
        RvCarrito.hasFixedSize()
    }

    /**
     * Sobreescribimos la funcionalidad de click desde la herencia de la interfaz
     * del TodoAdapter. Enviamos la información mediante un intent con parámetros
     * hacia el layout correspondiente.
     */
    override fun onItemCarritoClickListener(carrito: Carrito) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemCarritoLongClickListener(carrito: Carrito) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}


