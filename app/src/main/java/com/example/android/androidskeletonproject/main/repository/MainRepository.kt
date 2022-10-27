package com.example.android.androidskeletonproject.main.repository

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class MainRepository @Inject constructor()
{
    fun helloRepository(_mainResult: MutableLiveData<Any>)
    {
        _mainResult.value = "HELLO"
    }
}