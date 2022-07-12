package com.example.cobrakaiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarActivity : AppCompatActivity() {

    lateinit var btnregistrar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        btnregistrar = findViewById(R.id.BTNREGISTRAR)

        btnregistrar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
            }

            startActivity(intent)
        }
    }
}