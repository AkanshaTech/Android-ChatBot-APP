package com.example.chatbot

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.chatbot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* binding.generateImage.setOnClickListener{
            startActivity(Intent(this,ImageActivity::class.java))
        }*/

        binding.chatWithBot.setOnClickListener{
            startActivity(Intent(this,ChatActivity::class.java))
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)

    }
}