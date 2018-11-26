package com.example.sofia.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = "com.example.sofia.main.MENU1"

        var btniniciar = findViewById<Button>(R.id.btnIniciar)

        btniniciar.setOnClickListener {
            val intent = Intent(this, menu1::class.java)
            startActivity(intent)
        }
    }
}
