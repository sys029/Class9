package com.example.class9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val profileName=intent.getStringExtra("UserName")
        welocomeText.setText("Welcome, " + profileName)

        val osNames = arrayOf("Android","iOS","Windows","Symbian","Blackberry OS")

        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,osNames
        )

        osListView.adapter= arrayAdapter

        osListView.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this,"Item selected : "+osNames[i],Toast.LENGTH_SHORT).show()
        }
    }
}
