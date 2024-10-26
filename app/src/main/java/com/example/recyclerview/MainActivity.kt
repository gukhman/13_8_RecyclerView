package com.example.recyclerview

import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, false)

        initViews()
        setupListeners()
    }

    //Инициализация
    private fun initViews() {
        /*addBTN = findViewById(R.id.addBTN)
        clearBTN = findViewById(R.id.clearBTN)
        nameET = findViewById(R.id.nameET)
        weightET = findViewById(R.id.weightET)
        priceET = findViewById(R.id.priceET)
        goodsLV = findViewById(R.id.goodsLV)*/
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