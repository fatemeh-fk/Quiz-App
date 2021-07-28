package com.fatemeh.quizapp

object Constants {


    fun getQuestions():ArrayList<Question>{
        val  quesionList=ArrayList<Question>()
        val que1=Question(1,"which one is correct?",
            R.drawable.pic1,
            "Danger ahead: veer to the right",
            "Driver in this lane must turn right",
            "No parking from arrows to corner",
            "Left turn lane",2

        )
quesionList.add(que1)
        return quesionList

    }
}