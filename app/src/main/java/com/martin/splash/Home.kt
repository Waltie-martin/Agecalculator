package com.martin.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun buclickEvent(view: View){

        val DOB = findViewById<EditText>(R.id.txt1)
        val showAge = findViewById<TextView>(R.id.txt2)

        val userDOB: String = DOB.text.toString()
        if(userDOB.toInt() == 0){
            showAge.text = "invalid input"
            return
        }
        val year: Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        val avg = myAge/userDOB.toInt()

        showAge.text = "Your age is $myAge"
    }
}