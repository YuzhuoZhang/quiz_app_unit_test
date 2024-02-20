package com.example.quizunittest.model

// Methods
// get current question
// move to next question
// Methods
// get current question
// move to next question

data class QuestionsBank( var questionList: List<Question>)
{
    // locate question
    var currentIndex = 0

    fun getCurrentQuestion() : Question?
    {
        if(currentIndex >= 0 && currentIndex < questionList.size )
        {
            return questionList[currentIndex]
        }
        else {
            return null//index out of range
        }
    }

    fun moveToNextQuestion()
    {
        currentIndex ++
    }

    //optional ?
    fun availableQuestion():Boolean
    {
        return  currentIndex < questionList.size -1   //9 = 10-1?
    }

}