package com.example.quizaa

object Constants {

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What does thid flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Aregentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )

        questionList.add(que1)
        return questionList
    }
}