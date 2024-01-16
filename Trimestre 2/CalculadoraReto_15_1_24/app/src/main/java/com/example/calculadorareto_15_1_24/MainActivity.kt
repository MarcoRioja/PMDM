package com.example.calculadorareto_15_1_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_0 = findViewById<AppCompatButton>(R.id.btn_0)
        val btn_1 = findViewById<AppCompatButton>(R.id.btn_1)
        val btn_2 = findViewById<AppCompatButton>(R.id.btn_2)
        val btn_3 = findViewById<AppCompatButton>(R.id.btn_3)
        val btn_4 = findViewById<AppCompatButton>(R.id.btn_4)
        val btn_5 = findViewById<AppCompatButton>(R.id.btn_5)
        val btn_6 = findViewById<AppCompatButton>(R.id.btn_6)
        val btn_7 = findViewById<AppCompatButton>(R.id.btn_7)
        val btn_8 = findViewById<AppCompatButton>(R.id.btn_8)
        val btn_9 = findViewById<AppCompatButton>(R.id.btn_9)

        val btn_sum = findViewById<AppCompatButton>(R.id.btn_sum)
        val btn_sub = findViewById<AppCompatButton>(R.id.btn_sub)
        val btn_mul = findViewById<AppCompatButton>(R.id.btn_mul)
        val btn_div = findViewById<AppCompatButton>(R.id.btn_div)

        val btn_del = findViewById<AppCompatButton>(R.id.btn_del)
        val btn_equals = findViewById<AppCompatButton>(R.id.btn_equals)
        val btn_coma = findViewById<AppCompatButton>(R.id.btn_coma)

        val txt_0 = findViewById<TextView>(R.id.res_0)
        val txt_1 = findViewById<TextView>(R.id.res_1)
        val txt_2 = findViewById<TextView>(R.id.res_2)
        val txt_3 = findViewById<TextView>(R.id.res_3)

        var actualText = ""
        var num1 = 0
        var num2 = 0
        var operation = ' '
        var res = 0

        var resList = ArrayList<String>()

        btn_del.setOnClickListener {
            num1 = 0
            num2 = 0
            operation = ' '
            txt_0.setText("")
        }

        btn_coma.setOnClickListener() {

        }

        btn_equals.setOnClickListener() {
            if (operation != ' ') {
                when (operation) {
                    '+' -> res = num1 + num2
                    '-' -> res = num1 - num2
                    '*' -> res = num1 * num2
                    '/' -> res = num1 / num2
                }

                resList.add(String.format("%d %c %d = %d", num1,operation,num2,res))

                resList.reverse()
                if (resList.size >= 4) {
                    resList.removeAt(3)
                }
                txt_0.setText("")
                if (resList.size > 0) {txt_1.setText(resList[0])}
                if (resList.size > 1) {txt_2.setText(resList[1])}
                if (resList.size > 2) {txt_3.setText(resList[2])}

                num1 = 0
                num2 = 0
                operation = ' '
            }
        }

        btn_0.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 0
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 0
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_1.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 1
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 1
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_2.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 2
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 2
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_3.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 3
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 3
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_4.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 4
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 4
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_5.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 5
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 5
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_6.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 6
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 6
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_7.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 7
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 7
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_8.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 8
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 8
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }
        btn_9.setOnClickListener() {
            if (operation == ' ') {
                num1 = num1 * 10 + 9
                actualText = String.format("%d",num1)
            } else {
                num2 = num2 * 10 + 9
                actualText = String.format("%d %c %d",num1,operation,num2)
            }
            txt_0.setText(actualText)
        }

        btn_sum.setOnClickListener() {
            operation = '+'
            actualText = String.format("%d %c",num1,operation)
            txt_0.setText(actualText)
        }

        btn_sub.setOnClickListener() {
            operation = '-'
            actualText = String.format("%d %c",num1,operation)
            txt_0.setText(actualText)
        }

        btn_mul.setOnClickListener() {
            operation = '*'
            actualText = String.format("%d %c",num1,operation)
            txt_0.setText(actualText)
        }

        btn_div.setOnClickListener() {
            operation = '/'
            actualText = String.format("%d %c",num1,operation)
            txt_0.setText(actualText)
        }
    }
}