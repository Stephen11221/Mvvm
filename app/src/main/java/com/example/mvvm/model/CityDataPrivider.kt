package com.example.mvvm.model

import com.example.mvvm.R


class CityDataPrivider {
    private val cities = arrayListOf<City>()

    init {

        cities.add(City("Paris", R.drawable.paris, 2_100_000))
        cities.add(City("Rio de Janeiro", R.drawable.rio, 6_700_000))
        cities.add(City("Rome", R.drawable.rome, 2_800_000))
        cities.add(City("Singapore", R.drawable.singapore, 5_700_000))
        cities.add(City("Sydney", R.drawable.sydney, 5_300_000))
        cities.add(City("Tokyo", R.drawable.tokyo, 13_999_000))
    }

    fun getCities() = cities
}



