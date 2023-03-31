package com.example.localjson.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.localjson.repository.MyJsonRepository

class MyViewModel:ViewModel() {
    private val repository:MyJsonRepository = MyJsonRepository()
    fun myJson(context: Context) = repository.myJsonData(context)
    fun myGetJson(context: Context) = repository.myGetJson(context)
}