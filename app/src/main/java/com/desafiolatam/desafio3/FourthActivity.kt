package com.desafiolatam.desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafiolatam.desafio3.databinding.ActivityFourthBinding
import com.desafiolatam.desafio3.databinding.ActivitySecondBinding
import com.desafiolatam.desafio3.databinding.ActivityThirdBinding

class FourthActivity : AnimalActivity() {
    private lateinit var binding: ActivityFourthBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}