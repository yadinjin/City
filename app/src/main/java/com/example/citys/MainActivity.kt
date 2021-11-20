package com.example.citys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val citiesNameList:List<Cities> = listOf(
            Cities("Барнаул",695540),
            Cities("Бийск", 208077),
            Cities("Рубцовск",139565),
            Cities("Новоалтайск",74586),
            Cities("Белокуриха",15128)
        )
        val citiesRecyclerView:RecyclerView=findViewById(R.id.cities_recycler_view)
        citiesRecyclerView.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        citiesRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        citiesRecyclerView.adapter=CitiesAdapter(citiesNameList)

    }
}