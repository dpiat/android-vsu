package com.example.a4_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ViewActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        textView = findViewById(R.id.idTextView)

        var name: String? = intent.getStringExtra("name");
        textView.setText(name);
    }
}