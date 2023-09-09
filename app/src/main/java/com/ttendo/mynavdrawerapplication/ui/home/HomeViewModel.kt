package com.ttendo.mynavdrawerapplication.ui.home

import android.media.Image
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ttendo.mynavdrawerapplication.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

//    private val _imageArray = MutableLiveData<Int>().apply {
//        value = arrayOf(R.drawable.ferrari,R.drawable.chevrolet,R.drawable.nissan,R.drawable.land_rover,R.drawable.mercedes) as Int?
//    }
//    val imageList : LiveData<Int> = _imageArray

    val imageList = arrayOf(R.drawable.ferrari,R.drawable.chevrolet,R.drawable.nissan,R.drawable.land_rover,R.drawable.mercedes)
}