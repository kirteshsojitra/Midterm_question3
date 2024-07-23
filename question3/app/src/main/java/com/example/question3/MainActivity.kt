package com.example.question3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var btnColor: Button
    private lateinit var btnGreeting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.et_name)
        btnColor = findViewById(R.id.btn_color)
        btnGreeting = findViewById(R.id.btn_greeting)

        btnColor.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            startActivityForResult(intent, 1)
        }

        btnGreeting.setOnClickListener {
            val name = etName.text.toString()
            val color = intent.getStringExtra("color")
            val intent = Intent(this, GreetingActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("color", color)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            val color = data!!.getStringExtra("color")
            btnColor.text = "Favorite color: $color"
        }
    }
}