package com.example.retoandroidmaster

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText = findViewById<TextView>(R.id.resultTextRes)
        val resultValueText = findViewById<TextView>(R.id.resultTextNum)
        val resultValue = intent.getFloatExtra("value",0f)
        val resultDescText = findViewById<TextView>(R.id.resultTextDesc)
        val backBtn = findViewById<Button>(R.id.btnBack)

        var result = ""
        var desc = ""
        var color: Int = 16777215

        if (resultValue < 18.5f) {
            result = "Bajo peso"
            desc = "Insuficiente ingesta de nutrientes o posibles problemas de salud."
            color = 16711680
        }
        else if (resultValue >= 18.5f && resultValue < 25f) {
            result = "Peso Normal"
            desc = "Rango saludable"
            color = 65280
        }
        else if (resultValue >= 25f && resultValue < 30f) {
            result = "Sobrepeso"
            desc = "Aumenta el riesgo de enfermedades."
            color = 16776960
        }
        else if (resultValue > 30f) {
            result = "Obesidad"
            desc = "Riesgo de enfermedades o problemas salud como problemas crdiacos.."
            color = 16711680
        }
        else {
            result = "Desconocido"
            desc = "desconocido"
        }

        resultText.setText(result)
        resultDescText.setText(desc)
        resultValueText.setText(String.format("%.2f",resultValue))

        val mainAct = Intent(this, MainActivity::class.java)
        backBtn.setOnClickListener() {
            startActivity(mainAct)
        }
    }
}