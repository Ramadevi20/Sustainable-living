package com.example.greensteps

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.greensteps.databinding.ActivitySignupactivityBinding

class signupactivity : AppCompatActivity() {
    private val binding : ActivitySignupactivityBinding by lazy {
        ActivitySignupactivityBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signupactivity)
        binding.alreadybutton.setOnClickListener{
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
        }
    }
}
