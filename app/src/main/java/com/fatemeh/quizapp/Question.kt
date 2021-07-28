package com.fatemeh.quizapp

data class Question (
    val id:Int,
    val quesion:String,
    val image:Int,
    val optionOne:String,
    val optionTow:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)