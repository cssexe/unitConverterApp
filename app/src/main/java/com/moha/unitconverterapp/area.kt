package com.moha.unitconverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.unitconverterapp.databinding.ActivityAreaBinding

class area : AppCompatActivity() {
    lateinit var binding: ActivityAreaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // convert button
        binding.convertBtn2.setOnClickListener {
            convert()
        }

        // back Button
        binding.back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

    // function do conversion
    fun convert(){
        var inch: Double = binding.userinput2.text.toString().toDouble()
        inch *= 0.0254
        binding.resault2.text = inch.toString()
    }
}