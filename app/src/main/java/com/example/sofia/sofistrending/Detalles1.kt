package com.example.sofia.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detalles1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles1)

        val TAG = "com.example.sofia.main.DAMA"

        var¿m2 = findViewById<Button>(R.id.m2)

        m2.setOnClickListener {
            val intent = Intent(this, Dama::class.java)
            startActivity(intent)
        }
    }
}
