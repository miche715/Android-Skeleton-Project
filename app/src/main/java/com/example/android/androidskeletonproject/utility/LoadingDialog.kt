package com.example.android.androidskeletonproject.utility

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.example.android.androidskeletonproject.R

class LoadingDialog(context: Context) : Dialog(context)
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_dialog)

        setCancelable(false)  // 취소 불가능

        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))  // 다이얼로그의 배경 투명하게 바꿔줌
    }
}