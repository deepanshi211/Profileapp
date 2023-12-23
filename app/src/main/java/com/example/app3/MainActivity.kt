package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttoneducation = findViewById<Button>(R.id.btneducation)
        buttoneducation.setOnClickListener {
            intent = Intent(this,education::class.java)
            startActivity(intent) }

            val buttonskills = findViewById<Button>(R.id.btnskills)
            buttonskills.setOnClickListener {
                intent = Intent(this,Skillsactivity::class.java)
                startActivity(intent)
        }
        val buttoncoursework = findViewById<Button>(R.id.btncoursework)
        buttoncoursework.setOnClickListener {
            intent = Intent(this,coursework::class.java)
            startActivity(intent)
        }

        val buttonachievements = findViewById<Button>(R.id.btnachievements)
        buttonachievements.setOnClickListener {
            intent = Intent(this,achievements::class.java)
            startActivity(intent)
        }

    }
}


