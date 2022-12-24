package com.krutsav.quizapp23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val tv_question = findViewById<TextView>(R.id.tv_question)
        val tv_option1 = findViewById<TextView>(R.id.tv_option1)
        val tv_option2 = findViewById<TextView>(R.id.tv_option2)
        val tv_option3 = findViewById<TextView>(R.id.tv_option3)
        val tv_option4 = findViewById<TextView>(R.id.tv_option4)
        val btn_submit = findViewById<Button>(R.id.btn_submit)

        val gotQuestionsList = Constants.getQuestions();
        Log.i("Question", "${gotQuestionsList.size}")

        tv_question.text = gotQuestionsList[0].question.toString()
    }
}