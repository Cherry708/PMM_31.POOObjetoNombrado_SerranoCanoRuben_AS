package com.example.pmm_31pooobjetonombrado_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_31pooobjetonombrado_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter10.setOnClickListener {
            binding.tvResultado10.text = Matematica.enteroAleatorio(1,10).toString()
        }

    }
}
object Matematica{
    val PI = 3.141516
    fun enteroAleatorio(minimo:Int,maximo:Int):Int{
        return (minimo..maximo).random()
    }
}