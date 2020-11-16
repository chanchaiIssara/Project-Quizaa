package com.example.quizaa

object Constants {

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What does thid flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )

        questionList.add(que1)

        val que2 = Question(
            2, "What does thid flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas",
            "Belgium",
            "Benin",
            "Bolivia",
            2
        )

        questionList.add(que2)

        val que3 = Question(
            3, "What does thid flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Belgium",
            "Benin",
            "Bolivia",
            1
        )

        questionList.add(que1)

        val que4 = Question(
            4, "What does thid flag belong to?",
            R.drawable.ic_flag_of_egyptian,
            "Eritrea",
            "Equatorial Guinea",
            "El Salvador",
            "Egyptian",
            4
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What does thid flag belong to?",
            R.drawable.ic_flag_of_france,
            "Fiji",
            "Finland",
            "France",
            "Fuji",
            3
        )

        questionList.add(que3)

        return questionList



    }
}