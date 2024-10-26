package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WardrobeAdapter(private val items: List<WardrobeItem>) :
    RecyclerView.Adapter<WardrobeAdapter.WardrobeViewHolder>() {

    inner class WardrobeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.item_image)
        private val titleView: TextView = itemView.findViewById(R.id.item_title)
        private val descriptionView: TextView = itemView.findViewById(R.id.item_description)

        fun bind(item: WardrobeItem) {
            imageView.setImageResource(item.imageResId)
            titleView.text = item.title
            descriptionView.text = item.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WardrobeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wardrobe_item, parent, false)
        return WardrobeViewHolder(view)
    }

    override fun onBindViewHolder(holder: WardrobeViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}