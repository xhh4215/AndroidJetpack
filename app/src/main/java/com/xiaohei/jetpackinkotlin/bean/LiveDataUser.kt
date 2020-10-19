package com.xiaohei.jetpackinkotlin.bean

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataUser : ViewModel() {
    private val _name = MutableLiveData("小黑")
    private val _lastname = MutableLiveData("桂明")
    private val _age = MutableLiveData(12)


    val name = _name
    val lastname = _lastname
    val age = _age

    fun addAge() {
        _age.value = (_age.value ?: 0) + 1
    }


    fun mutableAge() {
        _age.value = (_age.value ?: 0) - 1
    }

}