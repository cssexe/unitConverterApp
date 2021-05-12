package com.moha.unitconverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.unitconverterapp.databinding.ActivityTemperatureBinding

class temperature : AppCompatActivity() {
    lateinit var  binding: ActivityTemperatureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTemperatureBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // convert button
        binding.convertBtn.setOnClickListener {
            converter()
        }

        // back Button
        binding.back2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
    // function do conversion
        fun converter (){
            var temp: Double = binding.userinput.text.toString().toDouble()
            temp = (temp * 9/5) + 32
            binding.resault.setText(temp.toString())
        }
    }
