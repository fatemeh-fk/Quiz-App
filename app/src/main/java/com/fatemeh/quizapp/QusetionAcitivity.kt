package com.fatemeh.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_qusetion_acitivity.*

class QusetionAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qusetion_acitivity)
        val questionList=Constants.getQuestions()
        Log.i("quesion size","${questionList.size}")

        val currentPos=1
        val question:Question?=questionList[currentPos-1]
        progressBar.progress=currentPos
        tv_progress.text="$currentPos"+"/"+progressBar.max
        tv_quesionid.text=question!!.quesion
        iv_image.setImageResource(question.image)
        tv_option_one.text=question.optionOne
        tv_option_two.text=question.optionTow
        tv_option_three.text=question.optionThree
        tv_option_four.text=question.optionFour
    }
}