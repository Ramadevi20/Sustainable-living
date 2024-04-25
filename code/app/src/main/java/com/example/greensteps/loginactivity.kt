package com.example.greensteps

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.greensteps.databinding.ActivityLoginactivityBinding
import com.example.greensteps.databinding.ActivityStartactivityBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener,View.OnFocusChangeListener, View.OnKeyListener {
    private lateinit var binding: ActivityLoginactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private fun validateEmail(): Boolean {
        var error: String? = null
        val value = binding.emailEt.text.toString()
        if(value.isEmpty()){
            error = "Email is required"
        }else if (Patterns.EMAIL_ADDRESS.matcher(value).matches()){
            error = "Email address is invalid"
        }
        return error == null
    }
    private fun validatepassword(){
        var error: String? = null
        val value = binding.PasswordEt.text.toString()
        if(value.isEmpty()){
            error = "Email is required"
        }else if (value.length <6){
            error = "password must be 6 characters long"
        }
        return error == null
    }
}

