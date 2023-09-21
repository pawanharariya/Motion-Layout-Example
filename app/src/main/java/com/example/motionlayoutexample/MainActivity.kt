package com.example.motionlayoutexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var animationOneButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animationOneButton = findViewById(R.id.animation_one_button)
        animationOneButton.setOnClickListener {

            val intent = Intent(applicationContext, AnimationOneActivity::class.java)
            startActivity(intent)
        }
    }
}