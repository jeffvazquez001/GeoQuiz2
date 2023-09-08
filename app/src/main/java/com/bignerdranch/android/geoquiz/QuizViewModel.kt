package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel: ViewModel() {
    private val questionBank = listOf(
        Question(R.string.question_Australia,true),
        Question(R.string.question_California, true),
        Question(R.string.question_Mexico, false),
        Question(R.string.question_USA,true)
    )

    private var currentIndex = 0

    val currentQuestionAnswer:Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText:Int
        get() = questionBank[currentIndex].textResId
    fun moveToNext(){
        currentIndex = (currentIndex + 1) % questionBank.size
    }
    fun moveToPrev(){
        currentIndex = (currentIndex - 1) % questionBank.size
    }
}