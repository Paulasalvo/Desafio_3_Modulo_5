package com.desafiolatam.desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafiolatam.desafio3.databinding.ActivityMainBinding
import com.desafiolatam.desafio3.databinding.ActivitySecondBinding

class SecondActivity : AnimalActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}