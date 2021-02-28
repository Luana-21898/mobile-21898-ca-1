package com.androidluana.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fNumber = findViewById<EditText>(R.id.firstNumber)
        val sNumber = findViewById<EditText>(R.id.secondNumber)
        val sResult = findViewById<TextView>(R.id.screenResult)
        val fButton = findViewById<Button>(R.id.resultBtn)
        val sButton = findViewById<Button>(R.id.clearText)

        fButton.setOnClickListener {

            sResult.text = (fNumber.text.toString().toInt() + sNumber.text.toString().toInt()).toString()
            Toast.makeText(this, sResult.text, Toast.LENGTH_LONG).show()
        }

        sButton.setOnClickListener {

            fNumber.setText("")
            sNumber.setText("")
            sResult.setText("")
        }
    }
}




