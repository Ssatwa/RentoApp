package com.example.rento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.auth.api.Auth
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation



class SignUpActivity : AppCompatActivity() {


    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    lateinit var auth: FirebaseAuth
    lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        myemail=findViewById(R.id.email1)
        mypassword=findViewById(R.id.pass1)
        myconfpassword=findViewById(R.id.pass2)
        signup=findViewById(R.id.btnsign)
        txt=findViewById(R.id.auth)
        auth= Firebase.auth

        val textView = findViewById<TextView>(R.id.welcome)
        val animation = ScaleAnimation(0f, 1f, 0f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        animation.duration = 1000 // Set the duration of the animation in milliseconds

        textView.startAnimation(animation)





        txt.setOnClickListener {
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        signup.setOnClickListener {
            SignUpUser()
        }

    }

    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=myconfpassword.text.toString()
        if (email.isBlank()|| pass.isBlank()|| confirmpass.isBlank()){
            Toast.makeText(this, "Email and password cannot be blank", Toast.LENGTH_LONG).show()
            return
        }
        else if (pass != confirmpass){
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this, "Signed up successfully", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "failed to register user", Toast.LENGTH_LONG).show()
            }
        }
    }

}