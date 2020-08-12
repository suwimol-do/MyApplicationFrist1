package com.example.myapplicationfrist.ui.about

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
      //  value = android:text="@string/text_about"
    }
    val text: LiveData<String> = _text
}