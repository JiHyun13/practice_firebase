package com.example.practice_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener{
            val database = Firebase.database
            var text = database.getReference("message")
            text.setValue(editText.text.toString())
            textView.setText(editText.text.toString())
            Toast.makeText(this, "성공하셨습니다", Toast.LENGTH_SHORT).show()
        }

    }
}