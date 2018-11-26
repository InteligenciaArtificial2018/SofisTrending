package com.example.sofia.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        val TAG = "com.example.sofia.main.CABALLERO"

        var t1 = findViewById<Button>(R.id.t1)

        t1.setOnClickListener {
            val intent = Intent(this, Dama::class.java)
            startActivity(intent)


            val TAG = "com.example.sofia.main.DAMA"

            var t2 = findViewById<Button>(R.id.t2)

            t2.setOnClickListener {
                val intent = Intent(this, Caballero::class.java)
                startActivity(intent)

                val TAG = "com.example.sofia.main.MENU1"

                var t3 = findViewById<Button>(R.id.t3)

                t3.setOnClickListener {
                    val intent = Intent(this, Ninos::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
