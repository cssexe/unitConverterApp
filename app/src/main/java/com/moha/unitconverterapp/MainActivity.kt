package com.moha.unitconverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.unitconverterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()

{
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // temperature convert page
        binding.temperature.setOnClickListener {
            val intent = Intent(this,temperature::class.java)
            startActivity(intent)
        }

        // area convert page
        binding.area.setOnClickListener {
            val intent = Intent(this,area::class.java)
            startActivity(intent)
        }

        // weight convert page
        binding.weight.setOnClickListener {
            val intent = Intent(this,weight::class.java )
            startActivity(intent)
        }

    }
}