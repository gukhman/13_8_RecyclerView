package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView

    private val items = mutableListOf<WardrobeItem>(
        WardrobeItem(R.drawable.shirt, "Рубашка", "Классическая рубашка"),
        WardrobeItem(R.drawable.jacket, "Куртка", "Легкая куртка"),
        WardrobeItem(R.drawable.pants, "Брюки", "Стильные брюки"),
        WardrobeItem(R.drawable.dress, "Платье", "Элегантное платье"),
        WardrobeItem(R.drawable.skirt, "Юбка", "Короткая юбка"),
        WardrobeItem(R.drawable.hat, "Шляпа", "Летняя шляпа"),
        WardrobeItem(R.drawable.shoes, "Туфли", "Классические туфли"),
        WardrobeItem(R.drawable.boots, "Сапоги", "Зимние сапоги"),
        WardrobeItem(R.drawable.sweater, "Свитер", "Уютный свитер"),
        WardrobeItem(R.drawable.socks, "Носки", "Теплые носки"),
        WardrobeItem(R.drawable.shorts, "Шорты", "Летние шорты"),
        WardrobeItem(R.drawable.sunglasses, "Солнцезащитные очки", "Очки от солнца"),
        WardrobeItem(R.drawable.coat, "Пальто", "Зимнее пальто"),
        WardrobeItem(R.drawable.backpack, "Рюкзак", "Городской рюкзак"),
        WardrobeItem(R.drawable.sneakers, "Кроссовки", "Удобные кроссовки"),
        WardrobeItem(R.drawable.image_part_001, "Пиджак", "На каждый день"),
        WardrobeItem(R.drawable.image_part_002, "Штаны", "Повседневная одежда для улицы"),
        WardrobeItem(R.drawable.image_part_003, "Другой свитер", "С кармашком"),
        WardrobeItem(R.drawable.image_part_005, "Свитер в полоску", "Для сисадмина"),
        WardrobeItem(R.drawable.image_part_006, "Жилетка", "На свадьбу"),
        WardrobeItem(R.drawable.image_part_009, "Джинсы", "Стильные, модные"),
        WardrobeItem(R.drawable.image_part_011, "Суперботы", "В таких хоть в лес"),
        WardrobeItem(R.drawable.handbag, "Сумка", "Модная сумка")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, true)

        initViews()

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = WardrobeAdapter(items)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        adapter.setOnItemClickListener(
            object : WardrobeAdapter.OnItemClickListener {
                override fun onItemClick(item: WardrobeItem, position: Int) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("item", item)
                    startActivity(intent)
                }
            })
    }

    //Инициализация
    private fun initViews() {
        recyclerView = findViewById(R.id.wardrobe_recycler_view)
    }

    //Слушатели нажатия
    private fun setupListeners() {
    }
}