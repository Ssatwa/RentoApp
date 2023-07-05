package com.example.rento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HostelsActivity : AppCompatActivity() {

    lateinit var hos1: CardView
    lateinit var hos2: CardView
    lateinit var hos3: CardView
    lateinit var hos4: CardView
    lateinit var hos5: CardView
    lateinit var hos6: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hostels)


        hos1=findViewById(R.id.cardHostel1)
        hos2=findViewById(R.id.cardHostel2)
        hos3=findViewById(R.id.cardHostel3)
        hos4=findViewById(R.id.cardHostel4)
        hos5=findViewById(R.id.cardHostel5)
        hos6=findViewById(R.id.cardHostel6)


        hos1.setOnClickListener {
            val intent= Intent(this, Hostel1Activity::class.java)
            startActivity(intent)
        }

        hos2.setOnClickListener {
            val intent= Intent(this, Hostel2Activity::class.java)
            startActivity(intent)
        }

        hos3.setOnClickListener {
            val intent= Intent(this, Hostel3Activity::class.java)
            startActivity(intent)
        }

        hos4.setOnClickListener {
            val intent= Intent(this, Hostel4Activity::class.java)
            startActivity(intent)
        }


        hos5.setOnClickListener {
            val intent= Intent(this, Hostel5Activity::class.java)
            startActivity(intent)
        }

        hos6.setOnClickListener {
            val intent= Intent(this, Hostel6Activity::class.java)
            startActivity(intent)
        }



    }
}