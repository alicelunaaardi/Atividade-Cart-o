package com.example.cadastrocartao.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cartao")
class CartaoModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_cartao")
    var id_cartao: Int = 0

    @ColumnInfo(name = "numero_cartao")
    var numero_cartao: String = ""

    @ColumnInfo(name = "titular")
    var titular: String = ""

    @ColumnInfo(name = "cvv")
    var cvv: String = ""

    @ColumnInfo(name = "data_vencimento")
    var data_vencimento: String = ""
}