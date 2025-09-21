package com.example.mypratice_intent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_intent.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private val binding by lazy {
        ActivityBBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 從intent中拿取值
        val extra_1 = intent.getIntExtra("message", -1)
        val extra_2 = intent.getStringExtra("message2")
        binding.extraIntentVale.text = "${extra_1} , ${extra_2}"


        setContentView(binding.root)
    }
}