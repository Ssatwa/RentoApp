package com.example.rento

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home3Activity : AppCompatActivity() {

    lateinit var btn1:Button
    lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home3)

        btn1=findViewById(R.id.btncall3)
        btn2=findViewById(R.id.btnpay3)


        //stk
        btn2.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }

        //call
        btn1.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0727498542")
            startActivity(dialIntent)}
    }
}