package com.moha.unitconverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.unitconverterapp.databinding.ActivityWeightBinding

class weight : AppCompatActivity() {
    lateinit var binding:ActivityWeightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // convert button
        binding.convertBtn3.setOnClickListener {
            weight()
        }

        // back Button
        binding.back3.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    // function do conversion
    fun weight (){
        var value:Double = binding.userinput3.text.toString().toDouble()
        value *= 0.45
        binding.resault3.text = value.toString()
    }
}