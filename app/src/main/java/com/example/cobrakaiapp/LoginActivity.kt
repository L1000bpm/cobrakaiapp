package com.example.cobrakaiapp

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var btningresar : Button
    lateinit var btnregistrarse : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btningresar = findViewById(R.id.BTNINGRESAR)

        btningresar.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnregistrarse = findViewById(R.id.TXTREGISTRARSE)
        

        btnregistrarse.setOnClickListener{
            val intent2 = Intent(this, RegistrarActivity::class.java).apply {
            }
            startActivity(intent2)
        }
    }
}