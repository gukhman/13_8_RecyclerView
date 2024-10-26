package com.example.recyclerview

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class DetailActivity : BaseActivity() {

    private lateinit var itemLayout: LinearLayout
    private lateinit var imageView: ImageView
    private lateinit var titleView: TextView
    private lateinit var descriptionView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, true)

        itemLayout = findViewById(R.id.itemLayout)
        titleView = findViewById(R.id.item_title)
        descriptionView = findViewById(R.id.item_description)
        imageView = findViewById(R.id.item_image)

        var item: WardrobeItem? = null
        if (intent.hasExtra("item")) {
            item = intent.getSerializableExtra("item") as WardrobeItem
        }
        if (item != null) {
            titleView.text = item.title
            descriptionView.text = item.description
            imageView.setImageResource(item.imageResId)
        }

        itemLayout.setOnLongClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = this.layoutInflater
            val dialogView = inflater.inflate(R.layout.update_dialog, null)
            dialog.setView(dialogView)
            val item_title = dialogView.findViewById<EditText>(R.id.item_title)
            val item_description = dialogView.findViewById<EditText>(R.id.item_description)
            dialogView.findViewById<ImageView>(R.id.item_image)

            dialog.setTitle("Обновить запись")
            dialog.setMessage("Введите данные ниже:")
            dialog.setPositiveButton("Обновить") { _, _ ->
                titleView.text = item_title.text.toString()
                descriptionView.text = item_description.text.toString()
                val item = WardrobeItem(
                    R.drawable.hat,
                    item_title.text.toString(),
                    item_description.text.toString()
                )
            }
            dialog.setNegativeButton("Отмена") { _, _ -> }
            dialog.create().show()
            false
        }
    }
}