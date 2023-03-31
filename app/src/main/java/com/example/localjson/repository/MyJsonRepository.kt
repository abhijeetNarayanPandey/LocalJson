package com.example.localjson.repository

import android.content.Context
import com.example.localjson.utility.Utility

class MyJsonRepository {
fun myJsonData(context: Context) = Utility.loadJSONFromAsset(context)
fun myGetJson(context: Context) = Utility.getJSONFromAssets(context)
}