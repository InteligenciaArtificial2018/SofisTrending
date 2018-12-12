package sofisapp.sofistrending.adaptadores

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import sofisapp.sofistrending.click_listener.ClickListener
import sofisapp.sofistrending.modelos.Detalles
import sofisapp.sofistrending.click_listener.LongClickListener
import sofisapp.sofistrending.R

class AdaptadorCustomDetalles(var context: Context, var items: ArrayList<Detalles>, var listener: ClickListener, var longClickListener: LongClickListener): RecyclerView.Adapter<AdaptadorCustomDetalles.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val vista = LayoutInflater.from(context).inflate(R.layout.activity_template, parent, false)

        return ViewHolder(vista, listener, longClickListener)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.foto?.setImageResource(item.foto)
        holder.titulo?.text = item.titulo
        holder.contenido?.text = item.contenido
    }

    class ViewHolder(var vista: View, var listener: ClickListener, var longClickListener: LongClickListener): RecyclerView.ViewHolder(vista), View.OnClickListener, View.OnLongClickListener {
        override fun onLongClick(v: View?): Boolean {
            longClickListener.LongClickListener(vista, adapterPosition)

            return true
        }

        override fun onClick(v: View?) {
            listener.onClick(vista, adapterPosition)
        }

        var foto: ImageView? = null
        var titulo: TextView? = null
        var contenido: TextView? = null


        init {
            foto = vista.findViewById(R.id.imgPrenda)
            titulo = vista.findViewById(R.id.tvTitulo)
            contenido = vista.findViewById(R.id.tvContenido)

            vista.setOnClickListener(this)
            vista.setOnLongClickListener(this)
        }
    }


}