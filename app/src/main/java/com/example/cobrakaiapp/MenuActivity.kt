package com.example.cobrakaiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    lateinit var btnrverdojos : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnrverdojos = findViewById(R.id.BTNVERDOJOS)

        btnrverdojos.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java).apply {
            }

            startActivity(intent)
        }
    }
}