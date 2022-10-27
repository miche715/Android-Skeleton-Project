package com.example.android.androidskeletonproject.main.view

import android.util.Log
import android.view.View
import androidx.activity.viewModels
import com.example.android.androidskeletonproject.R
import com.example.android.androidskeletonproject.base.BaseActivity
import com.example.android.androidskeletonproject.databinding.ActivityMainBinding
import com.example.android.androidskeletonproject.main.domain.MainVO
import com.example.android.androidskeletonproject.main.viewmodel.MainViewModel
import com.example.android.androidskeletonproject.utility.LoadingDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main)
{
    private val mainViewModel: MainViewModel by viewModels()

    private val loadingDialog: LoadingDialog by lazy { LoadingDialog(this@MainActivity) }

    override fun onInitialize()
    {
        binding.mainActivity = this@MainActivity
        binding.mainViewModel = mainViewModel

        mainViewModel.mainResult.observe(this@MainActivity)
        {
            val main = MainVO().apply()
            {
                this.text = it.toString()
            }

            Log.i(this.javaClass.simpleName, main.text!!)
            // loadingDialog.dismiss()
        }
    }

    fun onHelloButtonClick(view: View)
    {
        hideKeyBoard(view.windowToken)
        // loadingDialog.show()

        mainViewModel.helloViewModel()
    }
}