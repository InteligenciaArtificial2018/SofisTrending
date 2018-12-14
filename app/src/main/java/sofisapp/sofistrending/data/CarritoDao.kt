package sofisapp.sofistrending.data

import android.arch.persistence.room.*

@Dao
interface CarritoDao {
    /**
     * Retorna todos las tuplas de Todo en orden ascendente.
     */
    @Query("SELECT * FROM carrito ORDER BY id ASC")
    fun getListCarrito(): List<Carrito>

    /**
     * Retorna una tupla desde la tabla todo
     * @param id el valor de la llave primaria a retornar.
     */
    @Query("SELECT * FROM carrito WHERE id = :id")
    fun getItemCarrito(id: Int): Carrito

    /**
     * Inserta una nueva tupla en la tabla todo.
     * @param carrito la tupla a insertar en la tabla.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveCarrito(carrito: Carrito)

    /**
     * Actualiza una tupla en la tabla todo.
     * @param carrito el valor de la tupla a actualizar.
     */
    @Update
    fun updateCarrito(carrito: Carrito)

    /**
     * Remueve una tupla de la tabla todo.
     * @param carrito el valor de la tupla a remover.
     */
    @Delete
    fun deleteCarrito(carrito: Carrito)
}