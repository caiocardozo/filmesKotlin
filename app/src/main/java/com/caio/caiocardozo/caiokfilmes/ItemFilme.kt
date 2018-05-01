package com.caio.caiocardozo.caiokfilmes

import java.net.URI

class ItemFilme(
        val  titulo: String, val descricao: String,
        val dataLancamento: String, val avaliacao: Float
        ) {
    val id: String = ""
    var imagem: URI? = null


    constructor( titulo: String, descricao: String, dataLancamento: String, avaliacao: Float, imagem: URI) :
            this(titulo, descricao, dataLancamento,avaliacao) {
        this.imagem = imagem

    }
}
