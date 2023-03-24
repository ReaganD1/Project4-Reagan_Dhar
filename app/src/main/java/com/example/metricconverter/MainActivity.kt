package com.example.metricconverter

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.metricconverter.R.id.textviewKM


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mbutton: Button
        val mET: EditText
        val mTV: TextView
        mbutton = findViewById<View>(R.id.button) as Button
        mET = findViewById<View>(R.id.editText) as EditText
        mTV = findViewById<View>(R.id.textviewKM) as TextView
        mbutton.setOnClickListener {
            val convert = mET.text.toString().toDouble()
            mTV.text = (convert * 1.60934).toString()
            mTV.setTextColor(Color.BLACK)
        }
    }
}