package com.example.myapplicationfrist.ui.contact

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ContactViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
       // value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text
}