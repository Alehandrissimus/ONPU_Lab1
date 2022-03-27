package com.example.onpulab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Task1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.task1_activity)
    }
}