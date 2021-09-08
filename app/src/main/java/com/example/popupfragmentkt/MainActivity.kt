package com.example.popupfragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popupfragmentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.setOnClickListener {
            var dialog = CustomFragment()
            dialog.show(supportFragmentManager, "customDialog")
        }
    }
}