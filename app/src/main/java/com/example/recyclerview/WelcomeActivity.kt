package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, false)

        findViewById<Button>(R.id.to_wardrobe_button).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}