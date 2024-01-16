package com.example.calculadora_15_1_24_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = 0
        var num2 = 0
        var result = 0

        val opSumBtn = findViewById<AppCompatButton>(R.id.opSum)
        val opSubBtn = findViewById<AppCompatButton>(R.id.opSub)
        val opMulBtn = findViewById<AppCompatButton>(R.id.opMul)
        val opDivBtn = findViewById<AppCompatButton>(R.id.opDiv)

        var resultText = ""

        val intent = Intent(this,Result::class.java);

        opSumBtn.setOnClickListener {
            num1 = findViewById<EditText>(R.id.number1).text.toString().toInt()
            num2 = findViewById<EditText>(R.id.number2).text.toString().toInt()

            result = num1 + num2

            resultText = ("$num1 + $num2 = $result")
            intent.putExtra("RESULT_TEXT",resultText);
            startActivity(intent);
        }

        opSubBtn.setOnClickListener {
            num1 = findViewById<EditText>(R.id.number1).text.toString().toInt()
            num2 = findViewById<EditText>(R.id.number2).text.toString().toInt()

            result = num1 - num2

            resultText = ("$num1 - $num2 = $result")
            intent.putExtra("RESULT_TEXT",resultText);
            startActivity(intent);
        }

        opMulBtn.setOnClickListener {
            num1 = findViewById<EditText>(R.id.number1).text.toString().toInt()
            num2 = findViewById<EditText>(R.id.number2).text.toString().toInt()

            result = num1 * num2

            resultText = ("$num1 * $num2 = $result")
            intent.putExtra("RESULT_TEXT",resultText);
            startActivity(intent);
        }

        opDivBtn.setOnClickListener {
            num1 = findViewById<EditText>(R.id.number1).text.toString().toInt()
            num2 = findViewById<EditText>(R.id.number2).text.toString().toInt()

            if (num2 == 0) {
                resultText = ("El Numero 2 no puede ser 0")
            }
            else {
                result = num1 / num2
                resultText = ("$num1 / $num2 = $result")
                intent.putExtra("RESULT_TEXT",resultText);
                startActivity(intent);
            }
        }
    }
}