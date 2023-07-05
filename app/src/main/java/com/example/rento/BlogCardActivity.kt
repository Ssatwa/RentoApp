package com.example.rento

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BlogCardActivity : AppCompatActivity() {

    lateinit var fb:TextView
    lateinit var tweet:TextView
    lateinit var insta:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_card)

        fb=findViewById(R.id.fb)
        tweet=findViewById(R.id.tweet)
        insta=findViewById(R.id.ig)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100093987226952"))
            startActivity(browserIntent)
        }

        tweet.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100093987226952"))
            startActivity(browserIntent)
        }

        insta.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rento7098/"))
            startActivity(browserIntent)
        }



    }
}