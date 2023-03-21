package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnCounter.setOnClickListener {

            counter++
            binding.textView.text=counter.toString()
        }
        binding.btnReset.setOnClickListener {

            binding.textView.text=""
            counter=0
        }




}}
