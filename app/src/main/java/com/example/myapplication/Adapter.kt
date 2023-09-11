package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    // Define a classe Adapter e recebe uma lista de strings como parâmetro
    private val myList: List<String>
) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    // Cria uma nova visualização de item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Infla o layout item_adapter.xml para a visualização de item
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        // Retorna uma nova instância de MyViewHolder com a visualização de item inflada
        return MyViewHolder(itemView)
    }

    // Atualiza o conteúdo da visualização de item
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Obtém o nome da string na posição dada pela lista
        val name = myList[position]
        // Define o texto da visualização de texto do nome do item para a string atual
        holder.textName.text = name
    }

    // Retorna o número de itens na lista
    override fun getItemCount() = myList.size

    // Define uma classe interna para a visualização de item
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Inicializa a visualização de texto do nome do item com o ID textName
        val textName: TextView = itemView.findViewById(R.id.textName)
    }

}
