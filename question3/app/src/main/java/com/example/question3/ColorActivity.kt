package com.example.question3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ColorActivity : AppCompatActivity() {

    private lateinit var lvColors: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        lvColors = findViewById(R.id.lv_colors)

        val colors = arrayOf("Red", "Green", "Blue", "Yellow")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)
        lvColors.adapter = adapter

        lvColors.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val color = colors[position]
            val intent = Intent()
            intent.putExtra("color", color)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}