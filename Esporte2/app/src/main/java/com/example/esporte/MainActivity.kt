package com.example.esporte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.esporte.databinding.ActivityMainBinding
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val butaoLogin = binding.buttonLogin
        val nomeUsuario = binding.EnterUser
        val senhaUsuario = binding.EnterPass

        //Usuario: Ana
        //Senha: 123
        butaoLogin.setOnClickListener{
            if (nomeUsuario.text.toString() == "Ana" && senhaUsuario.text.toString() == "123"){
                val texto = nomeUsuario.text.toString()
                intent.putExtra("nome", texto)

                val intent = Intent(this, HomeActivity :: class.java)
                startActivity(intent)
            }



        }
    }
}