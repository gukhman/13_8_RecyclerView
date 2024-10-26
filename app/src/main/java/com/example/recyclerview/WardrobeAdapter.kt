package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WardrobeAdapter(private val items: List<WardrobeItem>) :
    RecyclerView.Adapter<WardrobeAdapter.WardrobeViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(item: WardrobeItem, position: Int)
    }

    class WardrobeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val titleView: TextView = itemView.findViewById(R.id.item_title)
        val descriptionView: TextView = itemView.findViewById(R.id.item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WardrobeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.wardrobe_item, parent, false)
        return WardrobeViewHolder(view)
    }

    override fun onBindViewHolder(holder: WardrobeViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description
        holder.itemView.setOnClickListener{
            if (onItemClickListener != null) onItemClickListener!!.onItemClick(item, position)
        }
    }

    override fun getItemCount(): Int = items.size

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        this.onItemClickListener = onItemClickListener
    }
}