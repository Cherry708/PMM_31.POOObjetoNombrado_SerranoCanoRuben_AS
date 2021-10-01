package com.example.pmm_31pooobjetonombrado_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_31pooobjetonombrado_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val dado = object {
            val listaDados = IntArray(5)
            fun rellenarLista(){
                for (i in listaDados.indices){
                    listaDados[i] = (1..6).random()
                }
            }
            fun mayorValor():Int{
                var mayorValor = listaDados[0]
                for (e in listaDados){
                    if (e > mayorValor)
                        mayorValor = e
                }
                return mayorValor
            }
            fun mostrar(): String {
                val dado = ""
                for (e in listaDados){
                    dado.plus("$e, ")
                }
                return dado
            }
        }
            binding.btnEnter20.setOnClickListener {
                dado.rellenarLista()
                val message = dado.listaDados.toString()+", dado mayor: ${dado.mayorValor()}"
                binding.tvResultado20.text = message
            }
    }
}