package com.example.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.catalin.mvvm_cities.viewmodel.CityViewModel
import com.example.mvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val model: CityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

          model.getCityData().observe(this, Observer { cities ->
            binding.CityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, cities.img, applicationContext.theme)
            )
            binding.cityNameTV.text = cities.name
            binding.cityPopulationTV.text = cities.population.toString()
        })
    }
}