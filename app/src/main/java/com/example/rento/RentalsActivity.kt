package com.example.rento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class RentalsActivity : AppCompatActivity() {

    lateinit var hse1:CardView
    lateinit var hse2:CardView
    lateinit var hse3:CardView
    lateinit var hse4:CardView
    lateinit var hse5:CardView
    lateinit var hse6:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rentals)

        hse1=findViewById(R.id.cardHouse1)
        hse2=findViewById(R.id.cardHouse2)
        hse3=findViewById(R.id.cardHouse3)
        hse4=findViewById(R.id.cardHouse4)
        hse5=findViewById(R.id.cardHouse5)
        hse6=findViewById(R.id.cardHouse6)

        hse1.setOnClickListener {
            val intent=Intent(this, Home1Activity::class.java)
            startActivity(intent)
        }

        hse2.setOnClickListener {
            val intent=Intent(this, Home2Activity::class.java)
            startActivity(intent)
        }

        hse3.setOnClickListener {
            val intent=Intent(this, Home3Activity::class.java)
            startActivity(intent)
        }

        hse4.setOnClickListener {
            val intent=Intent(this, Home4Activity::class.java)
            startActivity(intent)
        }


        hse5.setOnClickListener {
            val intent=Intent(this, Home5Activity::class.java)
            startActivity(intent)
        }

        hse6.setOnClickListener {
            val intent=Intent(this, Home6Activity::class.java)
            startActivity(intent)
        }
    }
}