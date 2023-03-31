package com.example.localjson.model


data class Users(
    val users:ArrayList<UserModelClass>
)
data class UserModelClass(
    val id:Int,
    val department_name:String,
    val facultyNo:String,
    val noOfStudent:String,
    val details:String,
    val location:String

)
