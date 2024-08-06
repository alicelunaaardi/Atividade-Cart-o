package com.example.cadastrocartao.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cadastrocartao.model.CartaoModel

@Dao
interface CartaoDao {

    @Insert
    fun InsertCartao(cartao: CartaoModel) : Long

    @Update
    fun updateCartao(cartao: CartaoModel) : Int

    @Delete
    fun deleteCartao(cartao: CartaoModel) : Int

    @Query("SELECT * FROM Cartao WHERE id_cartao = :id")
    fun get(id: Int): CartaoModel

    @Query("SELECT * FROM Cartao")
    fun getAll(): List<CartaoModel>
}
