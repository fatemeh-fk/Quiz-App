package com.fatemeh.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QusetionAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qusetion_acitivity)
        val questionList=Constants.getQuestions()
        Log.i("quesion size","${questionList.size}")
    }
}