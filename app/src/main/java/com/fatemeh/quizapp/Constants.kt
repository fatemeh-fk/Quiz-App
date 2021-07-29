package com.fatemeh.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val  quesionList=ArrayList<Question>()
        val que1=Question(1,"which one is correct?",
            R.drawable.pic11,
            "Danger ahead: veer to the right",
            "Driver in this lane must turn right",
            "No parking from arrows to corner",
            "Left turn lane",2

        )
quesionList.add(que1)

        val que2=Question(1,"which one is correct?",
            R.drawable.img1,
            "Approaching vehicles must stop, then may proceed with caution",
            "Do not stop in the area between the signs",
            "There are no stop signs in the direction of the arrows: proceed with caution",
            "No entry into intersection",1

        )
        quesionList.add(que2)
        val que3=Question(1,"which one is correct?",
            R.drawable.img10,
            "River ahead",
            "Bump or uneven pavement on the road ahead",
            "Bridge or Viaduct ahead",
            "Construction zone ahead: slow down",1

        )
        quesionList.add(que3)
        val que4=Question(1,"which one is correct?",
            R.drawable.img3,
            "Dead-end street ahead",
            "Slow-moving vehicle (travelling less than 40 km/h)",
            "Stop sign ahead",
            "Yield right-of-way to vehicle ahead",1

        )
        quesionList.add(que4)
        val que5=Question(1,"which one is correct?",
            R.drawable.img5,
            "Permissive sign",
            "Roundabout ahead",
            "Do not enter",
            "Route for large trucks",1

        )
        quesionList.add(que5)
        val que6=Question(1,"which one is correct?",
            R.drawable.img6,
            "Recreation area ahead",
            "Destination sign",
            "Provincial park notification",
            "Pedestrian control sign",4

        )
        quesionList.add(que6)
        val que7=Question(1,"which one is correct?",
            R.drawable.img9,
            "Railway crossing",
            "Keep left",
            "Do not enter this road",
            "Do not pass",1

        )
        quesionList.add(que7)
        val que8=Question(1,"which one is correct?",
            R.drawable.img6,
            "Free flow",
            "Winding road ahead",
            "Sharp turn or bend in the road",
            "Sharp turn or bend in the road ",4

        )
        quesionList.add(que8)
        val que9=Question(1,"which one is correct?",
            R.drawable.img3,
            "Stop 150 meters ahead",
            "Winding road ahead(travelling less than 40 km/h)",
            "Bump 150 meters ahead",
            "Stop only if other vehicles are approaching road in the direction of the arrow",1

        )
        quesionList.add(que9)
        val que10=Question(1,"which one is correct?",
            R.drawable.img10,
            "Left turn prohibited",
            "Winding road ahead(travelling less than 40 km/h)",
            "Right turn prohibited",
            "Road slippery when wet",1

        )
        quesionList.add(que10)
        return quesionList

    }
}