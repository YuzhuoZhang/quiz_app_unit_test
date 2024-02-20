package com.example.quizunittest.controller



import com.example.quizunittest.model.Question
import com.example.quizunittest.model.QuestionsBank


class QuestionController(private val questionsBank: QuestionsBank) {

    fun getCurrentQuestion(): Question? {
        return questionsBank.getCurrentQuestion()
    }

    fun moveToNextQuestion() {
        questionsBank.moveToNextQuestion()
    }


    fun availableQuestions(): Boolean {
        return questionsBank.availableQuestion()
    }
}