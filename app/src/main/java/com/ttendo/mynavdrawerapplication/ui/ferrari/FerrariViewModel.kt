package com.ttendo.mynavdrawerapplication.ui.ferrari

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FerrariViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is ferrari Fragment"
    }
    val text: LiveData<String> = _text
}