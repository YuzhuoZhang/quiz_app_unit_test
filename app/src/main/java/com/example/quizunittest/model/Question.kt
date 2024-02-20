package com.example.quizunittest.model


data class Question(    // struct
    val questionContent: String,  //val static
    val options: List<String>, // True False Skip
    val correctAnswer : String
)