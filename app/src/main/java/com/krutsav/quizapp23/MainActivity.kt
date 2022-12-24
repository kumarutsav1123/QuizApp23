package com.krutsav.quizapp23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start: Button = findViewById(R.id.btn_start)
        val et_name = findViewById<EditText>(R.id.et_name)

        btn_start.setOnClickListener {
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"not hehe", Toast.LENGTH_LONG).show()
            }
            else{
                val questonIntent = Intent(this, QuestionsActivity::class.java)
                startActivity(questonIntent)
                finish() //if finished then upon pressing back button the app will close and previous activity won't load
            }
        }
    }
}