package com.example.quizunittest.controller



import com.example.quizunittest.model.ScoreTrace

class ScoreController(private val scoreTrace: ScoreTrace) {

    fun updateScore(point: Int) {
        scoreTrace.updateScore(point)
    }

    fun getScore(): Int {
        return scoreTrace.getScore()
    }
}