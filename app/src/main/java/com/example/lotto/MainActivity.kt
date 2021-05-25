package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intent = findViewById<CardView>(R.id.nameCard)
        findViewById<CardView>(R.id.randomCard).setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }


        findViewById<CardView>(R.id.ConstellationCard).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        findViewById<CardView>(R.id.nameCard).setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
}