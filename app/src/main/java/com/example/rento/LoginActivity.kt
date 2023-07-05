package com.example.rento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var myemail1:EditText
    private lateinit var mypassword1:EditText
    lateinit var login1:Button
    private lateinit var auth: FirebaseAuth
    lateinit var txt2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myemail1=findViewById(R.id.email2)
        mypassword1=findViewById(R.id.pass3)
        login1=findViewById(R.id.btnlog)
        auth= FirebaseAuth.getInstance()
        txt2=findViewById(R.id.signin)


        val textView = findViewById<TextView>(R.id.welcomeback)
        val animation = ScaleAnimation(0f, 1f, 0f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        animation.duration = 1000 // Set the duration of the animation in milliseconds

        textView.startAnimation(animation)

        login1.setOnClickListener {
            login()
        }

        txt2.setOnClickListener {
            val intent= Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun login(){
        val email = myemail1.text.toString()
        val pass = mypassword1.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this, "Successfully logged in", Toast.LENGTH_LONG).show()
                val intent = Intent(this, HomeCardActivity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Log in failed. Please try again.", Toast.LENGTH_LONG).show()
        }
    }
}