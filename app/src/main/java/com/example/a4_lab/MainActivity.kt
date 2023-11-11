package com.example.a4_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var textEdt: EditText
    lateinit var submitBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textEdt = findViewById(R.id.idEditText)
        submitBtn = findViewById(R.id.idSubmitButton)

        submitBtn.setOnClickListener {
            val intent = Intent(applicationContext, ViewActivity::class.java);
            intent.putExtra("name", textEdt.text.toString())
            startActivity(intent)
        }
    }
}