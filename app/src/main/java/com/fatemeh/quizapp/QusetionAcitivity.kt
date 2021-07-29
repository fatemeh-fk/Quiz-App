package com.fatemeh.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_qusetion_acitivity.*

class QusetionAcitivity : AppCompatActivity() ,View.OnClickListener{

    private var mCurrrentPos:Int=1
    private  var mQuestionList:ArrayList<Question>? =null
    private var mselectedoption:Int=0
    private var mCorrectAnswer:Int=0
    private var mUserName:String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qusetion_acitivity)

        mUserName=intent.getStringExtra(Constants.USER_NAME)
        mQuestionList=Constants.getQuestions()
       // Log.i("quesion size","${questionList.size}")
         setQuestion()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        //submit button
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion(){

        //mCurrrentPos=1
        val question=mQuestionList !![mCurrrentPos-1]

        defaultOPtionsView();
        if(mCurrrentPos==mQuestionList!!.size){
            btn_submit.text="FINISH"
        }else{
            btn_submit.text="SUBMIT"
        }

        progressBar.progress=mCurrrentPos
        tv_progress.text="$mCurrrentPos" + "/"+progressBar.max

        tv_quesionid.text=question!!.quesion
        iv_image.setImageResource(question.image)
        tv_option_one.text=question.optionOne
        tv_option_two.text=question.optionTow
        tv_option_three.text=question.optionThree
        tv_option_four.text=question.optionFour


    }

private fun defaultOPtionsView(){
    val options =ArrayList<TextView>()
    options.add(0,tv_option_one)
    options.add(1,tv_option_two)
    options.add(2,tv_option_three)
    options.add(3,tv_option_four)

    for(option in options){
        option.setTextColor(Color.parseColor("#7A8089"))
        //Color.parsColor("#7A8089")
         option.typeface= Typeface.DEFAULT
        option.background=ContextCompat.getDrawable(
            this,
            R.drawable.default_option_border_bg
        )


    }
}

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.tv_option_one->{
               selectedOptionView(tv_option_one,1)
           }
           R.id.tv_option_two->{
               selectedOptionView(tv_option_two,2)
           }
           R.id.tv_option_three->{
               selectedOptionView(tv_option_three,3)
           }
           R.id.tv_option_four->{
               selectedOptionView(tv_option_four,4)
           }
           R.id.btn_submit->{
               if(mselectedoption==0){
                   mCurrrentPos++

                   when {

                       mCurrrentPos<=mQuestionList!!.size->{
                           setQuestion()

                       }else->{
                       //Toast.makeText(this, "you are done", Toast.LENGTH_SHORT).show()

                           val intent=Intent(this,ResultActivity::class.java)
                           intent.putExtra(Constants.USER_NAME,mUserName)
                       intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswer)
                       intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                       startActivity(intent)
                       finish()
                       }
                   }
               }else{
                   val question=mQuestionList?.get(mCurrrentPos-1)
                   if (question!!.correctAnswer!=mselectedoption){
                       answerView(mselectedoption,R.drawable.wrong_option_border_bg)
                   }else{
                       mCorrectAnswer++
                   }
                   answerView(question.correctAnswer,R.drawable.correct_option_border_bg)
                   if(mCurrrentPos==mQuestionList!!.size){
                       btn_submit.text="FINISH"
                   }else{
                       btn_submit.text="Go to next Question"
                   }
                   mselectedoption=0
               }


           }
       }
    }

    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                tv_option_one.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2->{
                tv_option_two.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3->{
                tv_option_three.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4->{
                tv_option_four.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }

        }

    }
private fun selectedOptionView(tv:TextView,selecedOptionNumber:Int){

    defaultOPtionsView()
    mselectedoption=selecedOptionNumber
    tv.setTextColor(Color.parseColor("#363A43"))
    tv.setTypeface(tv.typeface,Typeface.BOLD)

    tv.background=ContextCompat.getDrawable(
        this,
        R.drawable.selected_option_border_bg
    )
}
}