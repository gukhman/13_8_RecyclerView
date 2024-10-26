package com.example.recyclerview

import java.io.Serializable

data class WardrobeItem(
    val imageResId: Int,
    val title: String,
    val description: String
) : Serializable