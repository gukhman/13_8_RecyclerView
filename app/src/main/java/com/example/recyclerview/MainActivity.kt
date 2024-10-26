package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, true)

        initViews()

        val items = List(20) { index ->
            WardrobeItem(R.drawable.sample, "Элемент $index", "Описание элемента $index")
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WardrobeAdapter(items)
    }

    //Инициализация
    private fun initViews() {
        recyclerView = findViewById(R.id.wardrobe_recycler_view)
    }

    //Слушатели нажатия
    private fun setupListeners() {
       /* addBTN.setOnClickListener { handleAddButtonClick(it) }
        clearBTN.setOnClickListener { handleClearButtonClick(it) }
        goodsLV.setOnItemClickListener { _, _, position, _ ->
            showEditOrDeleteDialog(position)
        }*/
    }
}