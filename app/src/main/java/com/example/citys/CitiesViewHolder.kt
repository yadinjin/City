package com.example.citys

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CitiesViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView){

    fun bind(cityName:Cities){
        val cityNameTextView:TextView=itemView.findViewById(R.id.city_name_text_view)
        val populationTextView:TextView=itemView.findViewById(R.id.population_text_view)
        cityNameTextView.text = cityName.cityName
        val populationFormatted = "${cityName.population} человек"
        populationTextView.text = populationFormatted

        itemView.setOnClickListener{
        val cityNameFormatted = cityName.cityName+" - "+"${cityName.population} человек"
            Toast.makeText(itemView.context, cityNameFormatted, Toast.LENGTH_LONG).show()
        }

    }

}