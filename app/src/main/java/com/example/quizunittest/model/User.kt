package com.example.quizunittest.model

data class User(var userID:String){
    // getter
    fun getUserID(): String
    {
        return userID
    }
    //setter
    fun setUserID(newUserID: String)
    {
        this.userID = newUserID
    }
}