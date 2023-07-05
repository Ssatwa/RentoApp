package com.example.rento

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class HomeCardActivity : AppCompatActivity() {

    lateinit var rent:Button
    lateinit var host:Button
    lateinit var home:TextView
    lateinit var abt:TextView
    lateinit var FAQ:TextView
    lateinit var logout:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_card)

        rent=findViewById(R.id.cardRentals)
        host=findViewById(R.id.cardHostels)
        home=findViewById(R.id.hom)
        abt=findViewById(R.id.abt)
        FAQ=findViewById(R.id.faq)
        logout=findViewById(R.id.logout)


        rent.setOnClickListener {
            val intent=Intent(this, RentalsActivity::class.java)
            startActivity(intent)
        }

        host.setOnClickListener {
            val intent=Intent(this, HostelsActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            val intent=Intent(this, HomeCardActivity::class.java)
            startActivity(intent)
        }

        abt.setOnClickListener {
            val intent=Intent(this, BlogCardActivity::class.java)
            startActivity(intent)
        }

        FAQ.setOnClickListener {
            val intent=Intent(this, FAQCardActivity::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            //Toast.makeText(applicationContext, "You have logged out", Toast.LENGTH_LONG).show()

            var box= AlertDialog.Builder(this)


            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("CONTINUE", DialogInterface.OnClickListener { dialog, id -> finishAffinity() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Rento App")
            alert.show()
        }


    }
}