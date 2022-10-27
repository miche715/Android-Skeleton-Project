package com.example.android.androidskeletonproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T: ViewDataBinding>(@LayoutRes val layoutRes: Int): Fragment()
{
    protected var binding: T? = null

    protected abstract fun onInitialize()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        binding!!.lifecycleOwner = viewLifecycleOwner

        onInitialize()
    }

    override fun onDestroyView()
    {
        super.onDestroyView()

        binding = null
    }
}