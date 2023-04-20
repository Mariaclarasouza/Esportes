package com.example.esporte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esporte.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        val botaoAgendar = binding.buttonSchedule
        val botaoExercicio1 = binding.buttonExercise1

        botaoAgendar.setOnClickListener{
            val intent = Intent(this, AgendarActivity :: class.java)
            startActivity(intent)
        }

        botaoExercicio1.setOnClickListener{
            val intent = Intent(this, ExercicioActivity :: class.java)
            startActivity(intent)
        }
    }
}