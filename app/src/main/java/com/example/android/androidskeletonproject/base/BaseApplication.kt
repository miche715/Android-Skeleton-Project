package com.example.android.androidskeletonproject.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication : Application()
{
    companion object
    {
    }

    override fun onCreate()
    {
        super.onCreate()
    }
}