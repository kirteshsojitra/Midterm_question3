package com.example.question3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {

    private lateinit var tvGreeting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        tvGreeting = findViewById(R.id.tv_greeting)

        val name = intent.getStringExtra("name")
        val color = intent.getStringExtra("color")
        val greeting = "Hello, $name! Your favorite color is $color."
        tvGreeting.text = greeting
    }
}