package com.example.a07ex07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var r = findViewById<RecyclerView>(R.id.rv)
        r.layoutManager = LinearLayoutManager(this)

        // definindo o array de produtos
        var arr = ArrayList<Produto>()
        // adicionando dois primeiros produtos
        arr.add(Produto(android.R.drawable.ic_menu_camera, "Mouse sem fio", "R$ 15,00"))
        arr.add(Produto(android.R.drawable.ic_menu_call, "Teclado sem fio", "R$ 125,00"))
        // adicionando os demais produtos fictícios
        for (i in 3 .. 99)
            arr.add(Produto(android.R.drawable.ic_menu_edit,"Produto $i", "R$ $i,90"))
        // definindo o adapter
        var adapter = CustomAdapter(arr)
        r.adapter = adapter
    }
}