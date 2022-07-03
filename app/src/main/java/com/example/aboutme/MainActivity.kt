package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var myName = MyName("Hello")
    lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.myName = myName
        binding.btnDone.setOnClickListener {
            myName.nickname = binding.etNickName.text.toString()
            binding.invalidateAll()
            binding.etNickName.visibility = View.GONE
            binding.btnDone.visibility = View.GONE
            binding.tvNickname.visibility = View.VISIBLE
        }
    }
}