package com.example.android.androidskeletonproject.utility

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.android.androidskeletonproject.R

@BindingAdapter("photo_uri")
fun bindImageFromUrl(view: ImageView, profilePhotoUri: String?)
{
//    if(!profilePhotoUri.isNullOrEmpty())
//    {
//        Glide.with(view.context).load(profilePhotoUri).into(view)
//    }
//    else
//    {
//        Glide.with(view.context).load(R.drawable.default_profile_photo).into(view)
//    }
}