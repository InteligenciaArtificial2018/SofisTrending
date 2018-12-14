package sofisapp.sofistrending

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import sofisapp.sofistrending.data.Carrito

class CarritoAdapter(var listaCarrito: List<Carrito>? = ArrayList<Carrito>()): RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {
    private var onItemCarritoCarritoClickListener: OnItemCarritoClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CarritoAdapter.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.template_item_carrito, parent, false)

        return ViewHolder(vista, listaCarrito!!)
    }

    override fun getItemCount(): Int {
        return listaCarrito?.count()!!
    }

    override fun onBindViewHolder(holder: CarritoAdapter.ViewHolder, position: Int) {
        // Obtener la posición del item clickeado
        holder.vista.setOnClickListener{
            onItemCarritoCarritoClickListener?.onItemCarritoClickListener(listaCarrito?.get(position)!!)
        }
        holder.vista.setOnLongClickListener{
            onItemCarritoCarritoClickListener?.onItemCarritoLongClickListener(listaCarrito?.get(position)!!)
            true
        }
        holder.onBindViews(position)
    }

    class ViewHolder(val vista: View, val listaCarrito: List<Carrito>): RecyclerView.ViewHolder(vista) {
        fun onBindViews(position: Int) {
            vista.findViewById<TextView>(R.id.tvNombre).text = listaCarrito.get(position).nombre
            vista.findViewById<TextView>(R.id.tvCantidad).text = listaCarrito.get(position).cantidad.toString()
            vista.findViewById<TextView>(R.id.tvPrecio).text = listaCarrito.get(position).precio.toString()
        }
    }

    /**
     * Utilizamos un método en lugar de asignar la funcionalidad vía el constructor
     * de la clase principal para mayor comodidad al momento de sobreescribir la funcionalidad.
     */
    fun setItemCarritoClickListener(onItemCarritoClickListener: OnItemCarritoClickListener) {
        this.onItemCarritoCarritoClickListener = onItemCarritoClickListener
    }

    /**
     * Definimos la interface que permite extender métodos que el RecyclerView no posee
     */
    interface OnItemCarritoClickListener {
        fun onItemCarritoClickListener(carrito: Carrito)
        fun onItemCarritoLongClickListener(carrito: Carrito)
    }
}