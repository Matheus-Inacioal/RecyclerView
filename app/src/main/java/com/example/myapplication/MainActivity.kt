package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //declaração da variável que vai referenciar o arquivo de layout da MainActivity
    private lateinit var binding: ActivityMainBinding
    //método executado ao criar a activit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //infla o layout da MainActivity na variável binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //define o layout da tela com base no arquivo de layout definido em binding
        setContentView(binding.root)
        //chama o método que inicializa o RecyclerView
        initRecyclerView()
    }
    //método que inicializa o RecyclerView
    private fun initRecyclerView() {
        //define o layout do RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        //define que o tamanho do RecyclerView é fixo
        binding.recyclerView.setHasFixedSize(true)
        //define o adapter do RecyclerView com base na lista gerada pelo método getList()
        binding.recyclerView.adapter = Adapter(getList())
    }
    //método que gera a lista de nomes
    private fun getList() = listOf(
        "Alice Alves",
        "Beatriz Barbosa",
        "Carla Costa",
        "Diego Dias",
        "Erica Evangelista",
        "Felipe Fernandes",
        "Gabriela Gomes",
        "Hugo Henriques",
        "Isabela Inácio",
        "João Júnior",
        "Karina Kozlowski",
        "Leonardo Lemos",
        "Mariana Melo",
        "Natalia Nascimento",
        "Otávio Oliveira",
        "Paula Pereira",
        "Rafael Ramos",
        "Sofia Santos",
        "Thiago Torres",
        "Ulisses Uchoa",
        "Vitoria Vaz",
        "Wellington Wanderley",
        "Xavier Xavier",
        "Yasmin Yanes",
        "Zacarias Zanin"
    )
}