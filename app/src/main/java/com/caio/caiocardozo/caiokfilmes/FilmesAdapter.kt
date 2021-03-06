package com.caio.caiocardozo.caiokfilmes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RatingBar
import android.widget.TextView

class FilmesAdapter(context: Context?, filmes: ArrayList<ItemFilme>) : ArrayAdapter<ItemFilme>(context, 0, filmes) {

    private  val VIEW_TYPE_DESTAQUE: Int = 0

    private val VIEW_TYPE_ITEM: Int = 1

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        //recupera a view atrasves da posicao
        var viewType = getItemViewType(position)
        var filme = getItem(position)
        var itemView = convertView

        if (itemView != null){

        }
        val retorno = when(viewType){

          VIEW_TYPE_DESTAQUE ->{

             itemView = LayoutInflater.from(context).inflate(R.layout.item_filme_destaque, parent, false)

              var descricao: TextView = itemView!!.findViewById(R.id.itemDescricao)
              descricao.text = filme.descricao

              var avaliacao: RatingBar = itemView!!.findViewById(R.id.itemAvaliacao)
              avaliacao.rating = filme.avaliacao
          }
            else -> {
                itemView = LayoutInflater.from(context).inflate(R.layout.item_filme, parent, false)

                var titulo: TextView = itemView!!.findViewById(R.id.itemTitulo)
                titulo.text = filme.titulo

                var descricao: TextView = itemView!!.findViewById(R.id.itemDescricao)
                descricao.text = filme.descricao

                var dataLancamento : TextView = itemView!!.findViewById(R.id.itemData)
                dataLancamento.text = filme.dataLancamento

                var avaliacao: RatingBar = itemView!!.findViewById(R.id.itemAvaliacao)
                avaliacao.rating = filme.avaliacao
            }
        }

        return itemView
    }

    override fun getItemViewType(position: Int): Int {
        //em Kotlin nao tem oeradore ternario mas e facil manipular.
        return if (position == 0) VIEW_TYPE_DESTAQUE else VIEW_TYPE_ITEM
    }

    //retorna o numero dos tipos de views que iremos ter
    override fun getViewTypeCount(): Int {
        return 2
    }
}



