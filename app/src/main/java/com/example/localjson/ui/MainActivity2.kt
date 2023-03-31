package com.example.localjson.ui

import android.content.Intent
import android.location.LocationManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.localjson.R

class MainActivity2 : AppCompatActivity() {
    val REQUEST_LOCATON = 1
    lateinit var locationManager:LocationManager
    lateinit var latitude:String;
    lateinit var longitude:String;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn:Button = findViewById<Button>(R.id.tv_btn)

        val faculty:TextView = findViewById<TextView>(R.id.tv_faculty)
        val noOfStd:TextView = findViewById<TextView>(R.id.tv_noOfStudent)
        val detail:TextView = findViewById<TextView>(R.id.tv_details)
        val depName:TextView = findViewById<TextView>(R.id.tv_name)

        val id1:TextView = findViewById<TextView>(R.id.tv_id)
        val id = intent.extras!!.getString("id")
        val department_name= intent.extras!!.getString("department_name")
        depName.setText(department_name)
        val facultyNo = intent.extras!!.getString("facultyNo")
        faculty.setText(facultyNo)
        val noOfStudent = intent.extras!!.getString("noOfStudent")
        noOfStd.setText(noOfStudent)
        val details = intent.extras!!.getString("details")
        detail.setText(details)
        val location = intent.extras!!.getString("location")
        btn.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(location))
            val chooser: Intent = Intent.createChooser(intent, "Launch Maps")
            startActivity(chooser)
        }
    }
}