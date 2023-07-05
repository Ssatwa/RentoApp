package com.example.rento

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class  FAQCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faqcard)

        val question1Layout: LinearLayout = findViewById(R.id.question1Layout)
        val answer1: TextView = findViewById(R.id.answer1)

        question1Layout.setOnClickListener {
            toggleAnswerVisibility(answer1)
        }

        val question2Layout: LinearLayout = findViewById(R.id.question2Layout)
        val answer2: TextView = findViewById(R.id.answer2)

        question2Layout.setOnClickListener {
            toggleAnswerVisibility(answer2)
        }

        val question3Layout: LinearLayout = findViewById(R.id.question3Layout)
        val answer3: TextView = findViewById(R.id.answer3)

        question3Layout.setOnClickListener {
            toggleAnswerVisibility(answer3)
        }

        val question4Layout: LinearLayout = findViewById(R.id.question4Layout)
        val answer4: TextView = findViewById(R.id.answer4)

        question4Layout.setOnClickListener {
            toggleAnswerVisibility(answer4)
        }

    }

    private fun toggleAnswerVisibility(answerTextView: TextView) {
        if (answerTextView.visibility == View.VISIBLE) {
            answerTextView.visibility = View.GONE
        } else {
            answerTextView.visibility = View.VISIBLE
        }
    }
}
