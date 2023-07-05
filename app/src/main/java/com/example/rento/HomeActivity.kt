package com.example.rento

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel


class HomeActivity : AppCompatActivity() {

    lateinit var logout:CardView
    lateinit var hc:CardView
    lateinit var blog:CardView
    lateinit var prof:CardView
    lateinit var faq:CardView
    lateinit var set:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        logout=findViewById(R.id.cardLogout)
        hc=findViewById(R.id.cardHome)
        blog=findViewById(R.id.cardBlog)
        prof=findViewById(R.id.cardProfile)
        faq=findViewById(R.id.cardFAQ)
        set=findViewById(R.id.cardSettings)


        logout.setOnClickListener {
            //Toast.makeText(applicationContext, "You have logged out", Toast.LENGTH_LONG).show()

            var box= AlertDialog.Builder(this)


            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("CONTINUE", DialogInterface.OnClickListener { dialog, id -> finishAffinity() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("Rento App")
            alert.show()
        }

        hc.setOnClickListener {
            val intent= Intent(this, HomeCardActivity::class.java)
            startActivity(intent)
        }

        blog.setOnClickListener {
            val intent=Intent(this, BlogCardActivity::class.java)
            startActivity(intent)
        }

        prof.setOnClickListener {
            val intent=Intent(this, ProfileCardActivity::class.java)
            startActivity(intent)
        }

        faq.setOnClickListener {
            val intent=Intent(this, FAQCardActivity::class.java)
            startActivity(intent)
        }

        set.setOnClickListener {
            val intent=Intent(this, SettingsCardActivity::class.java)
            startActivity(intent)
        }
    }
}