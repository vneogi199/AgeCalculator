package com.example.vinit.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ageMessage.setText("")
    }
    public fun calculateAge(view : View){
        val dob : String = birthYearInput.text.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - dob.toInt()
        ageMessage.setText("Your age is : ${age}")
    }
}
