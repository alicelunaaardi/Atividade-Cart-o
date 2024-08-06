package com.example.cadastrocartao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cadastrocartao.model.CartaoModel
import com.example.cadastrocartao.repository.AppDatabasse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cartaoDatabasse = AppDatabasse.getDataBase(this).cartaoDAO()

        val retornoInsertMultiplo = cartaoDatabasse.InsertCartao(CartaoModel().apply{
            this.numero_cartao = "618493759"
            this.titular = "Alice Lunardi"
            this.cvv = "234"
            this.data_vencimento = "02/08/2035"
        })

        val retornoSelectMultiplo = cartaoDatabasse.getAll()

        for (item in retornoSelectMultiplo){
            Log.d(
                "Retorno",
                "id_cartao: ${item.id_cartao}, numero:${item.numero_cartao}, titular: ${item.titular}, cvv: ${item.cvv}, data_vencimento: ${item.data_vencimento}"
            )
        }
    }
}