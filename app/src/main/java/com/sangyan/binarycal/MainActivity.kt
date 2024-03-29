package com.sangyan.binarycal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binaryInput1 = findViewById<EditText>(R.id.binaryInput1)
        val binaryInput2 = findViewById<EditText>(R.id.binaryInput2)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        val resultOutput = findViewById<TextView>(R.id.resultOutput)

        addButton.setOnClickListener {
            val binary1 = binaryInput1.text.toString()
            val binary2 = binaryInput2.text.toString()
            val result = binaryAddition(binary1, binary2)
            resultOutput.text = "Result: $result"
        }

        subtractButton.setOnClickListener {
            val binary1 = binaryInput1.text.toString()
            val binary2 = binaryInput2.text.toString()
            val result = binarySubtraction(binary1, binary2)
            resultOutput.text = "Result: $result"
        }

        multiplyButton.setOnClickListener {
            val binary1 = binaryInput1.text.toString()
            val binary2 = binaryInput2.text.toString()
            val result = binaryMultiplication(binary1, binary2)
            resultOutput.text = "Result: $result"
        }

        divideButton.setOnClickListener {
            val binary1 = binaryInput1.text.toString()
            val binary2 = binaryInput2.text.toString()
            val result = binaryDivision(binary1, binary2)
            resultOutput.text = "Result: $result"
        }
    }

    private fun binaryAddition(binary1: String, binary2: String): String {
        val num1 = binary1.toInt(2)
        val num2 = binary2.toInt(2)
        val sum = num1 + num2
        return Integer.toBinaryString(sum)
    }

    private fun binarySubtraction(binary1: String, binary2: String): String {
        val num1 = binary1.toInt(2)
        val num2 = binary2.toInt(2)
        val diff = num1 - num2
        return Integer.toBinaryString(diff)
    }

    private fun binaryMultiplication(binary1: String, binary2: String): String {
        val num1 = binary1.toInt(2)
        val num2 = binary2.toInt(2)
        val product = num1 * num2
        return Integer.toBinaryString(product)
    }

    private fun binaryDivision(binary1: String, binary2: String): String {
        val num1 = binary1.toInt(2)
        val num2 = binary2.toInt(2)
        val quotient = num1 / num2
        return Integer.toBinaryString(quotient)
    }
}
