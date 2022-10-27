package com.example.android.androidskeletonproject.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.androidskeletonproject.main.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel()
{
    private val _mainResult: MutableLiveData<Any> = MutableLiveData()
    var mainResult: LiveData<Any> = _mainResult

    fun helloViewModel()
    {
        mainRepository.helloRepository(_mainResult)
    }
}