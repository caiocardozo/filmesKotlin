package com.caio.caiocardozo.caiokfilmes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RatingBar
import android.widget.TextView

class FilmesAdapter(context: Context?, filmes: ArrayList<ItemFilme>) : ArrayAdapter<ItemFilme>(context, 0, filmes) {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_filme, parent, false)
        }

        var filme = getItem(position)

        var titulo: TextView = itemView!!.findViewById(R.id.itemTitulo)
        titulo.text = filme.titulo

        var descricao: TextView = itemView!!.findViewById(R.id.itemDescricao)
        descricao.text = filme.descricao

        var dataLancamento : TextView = itemView!!.findViewById(R.id.itemData)
        dataLancamento.text = filme.dataLancamento

        var avaliacao: RatingBar = itemView!!.findViewById(R.id.itemAvaliacao)
        avaliacao.rating = filme.avaliacao


        return itemView
    }
}



