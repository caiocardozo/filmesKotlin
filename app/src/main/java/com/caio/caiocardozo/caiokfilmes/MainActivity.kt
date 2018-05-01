package com.caio.caiocardozo.caiokfilmes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView: ListView = findViewById(R.id.list_filmes)

        var arrayList = ArrayList<ItemFilme>()


        arrayList.add(ItemFilme("Homem Aranha", "filme da aranha mais famosa do mundo", "01/10/2010", 4F))
        arrayList.add(ItemFilme("Batman", "Filme do morcego", "01/12/2016",5F))
        arrayList.add(ItemFilme("Super man", "Filme do homem indestrutível", "12/02/2016",2.5f ))
        arrayList.add(ItemFilme("Homem de ferro", "Filme do bacaninha", "8/8/2018",3.5f ))
        arrayList.add(ItemFilme("Lanterna verde", "Filme do hulk magrelo", "21/09/2015",3f ))

//        FilmesAdapter adapter = new FilmesAdapter(this, arrayList);
//
//        listView.setAdapter(adapter);

        var adapter = FilmesAdapter(this, arrayList)
        listView.adapter = adapter
    }
}
