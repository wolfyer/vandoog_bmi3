package com.vangood.bmi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.vangood.bmi3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun calculatebmi(view: View){
        val weight = binding.edWeight.text.toString().toFloat()
        val height = binding.edHeight.text.toString().toFloat()
        val bmi = weight/(height*height)
        //Builder
        val builder = AlertDialog.Builder(this)
        builder.setMessage("your bmi is $bmi")
        builder.show()

    }
    fun clearall(view: View){
        binding.edWeight.setText("")
        binding.edHeight.setText("")

    }
}