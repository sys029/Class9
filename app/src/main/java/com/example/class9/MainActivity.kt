package com.example.class9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var user = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener(View.OnClickListener {

            user = editTextName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("UserName", user)
            startActivity(intent)
        })

    }
}
