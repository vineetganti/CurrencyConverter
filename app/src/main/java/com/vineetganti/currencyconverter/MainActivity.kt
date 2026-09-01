package com.vineetganti.currencyconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Declare the variables for the UI components
    lateinit var titleTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var editText: EditText
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize the UI components
        titleTextView = findViewById(R.id.textView)
        resultTextView = findViewById(R.id.resultText)
        editText = findViewById(R.id.editText)
        convertButton = findViewById(R.id.convertBTN)

        // Set the click listener for the convert button
        convertButton.setOnClickListener {
            // Get the input value from the EditText
            val enterUSD: String = editText.text.toString()
            val enterUSDdouble: Double = enterUSD.toDouble()

            var euros = makeConversion(enterUSDdouble)
            resultTextView.text = "$euros Euros"
        }
    }

    fun makeConversion(usd:Double) :Double {
        val euro:Double = usd * 0.95
        return euro
    }
}