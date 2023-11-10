package com.example.birthdaygreeting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreeting.databinding.ActivityBirthdayGreetingBinding


class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }

    private lateinit var binding: ActivityBirthdayGreetingBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name= intent.getStringExtra(NAME_EXTRA)
        binding.birthdayGreeting.text = "Happy Birthday\n $name!"
    }
}