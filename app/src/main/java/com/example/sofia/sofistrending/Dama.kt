package com.example.sofia.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dama)

        val TAG = "com.example.sofia.main.DETALLES"

        var btnn = findViewById<Button>(R.id.btnn)

        btnn.setOnClickListener {
            val intent = Intent(this, Detalles::class.java)
            startActivity(intent)

            val TAG = "com.example.sofia.main.DETALLES"

            var mm1 = findViewById<Button>(R.id.mm1)

            mm1.setOnClickListener {
                val intent = Intent(this, Detalles1::class.java)
                startActivity(intent)
            }
        }
    }
}

