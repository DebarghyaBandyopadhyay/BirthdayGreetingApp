package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.Intent
import com.example.birthdaygreeting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun createBirthdayCard(view: View) {
        val name = binding.nameInput.editableText.toString()
        Toast.makeText(this,"Name is : $name", Toast.LENGTH_LONG).show()
        val intent= Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra("name_extra", name)
        startActivity(intent)
    }
}