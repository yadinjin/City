package com.example.citys

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CitiesAdapter(private val citiesNameList:List<Cities>) : RecyclerView.Adapter<CitiesViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesViewHolder {

        val citiesItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.cities_list_item, parent,false)

        return CitiesViewHolder(citiesItemView)
    }

    override fun onBindViewHolder(holder: CitiesViewHolder, position: Int) {
        val cityName = citiesNameList[position]
        holder.bind(cityName)
    }

    override fun getItemCount(): Int {
        return citiesNameList.size
    }

}