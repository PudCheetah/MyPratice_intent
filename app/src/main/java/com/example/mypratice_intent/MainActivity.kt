package com.example.mypratice_intent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_intent.databinding.ActivityBBinding
import com.example.mypratice_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnJump.setOnClickListener {
            val myIntent = Intent(this, ActivityB::class.java)
            myIntent.putExtra("message",123321)
            myIntent.putExtra("message2", "Hellow")
            startActivity(myIntent)
            myIntent.getStringExtra("123")
        }
        binding.btnJump
        setContentView(binding.root)
    }
}