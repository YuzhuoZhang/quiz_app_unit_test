package com.example.quizunittest.model

class ScoreTrace( var score:Int ){  // attribute: score

    // get current score
    fun getScore() : Int
    {
        return score
    }

    // update
    fun updateScore(point : Int)  // point : 0, 1
    {
        score += point //score ++ ?
    }

}