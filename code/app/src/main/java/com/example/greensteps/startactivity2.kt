package com.example.greensteps

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.greensteps.databinding.ActivityStartactivityBinding

class startactivity2 : AppCompatActivity() {
    private val binding: ActivityStartactivityBinding by lazy {
        ActivityStartactivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSkip.setOnClickListener {
            val intent = Intent(this, startactivity3::class.java)
            startActivity(intent)
            binding.button2.setOnClickListener {
                val intent = Intent(this, startactivity3::class.java)
                startActivity(intent)
            }
        }
    }
}