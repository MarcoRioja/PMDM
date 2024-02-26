package com.example.pruebaandroidmarco.Prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.pruebaandroidmarco.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_result)

        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_result, null)

        val linearLayout = rootView.findViewById<LinearLayout>(R.id.dataList)

        val name = TextView(this)
        name.setText("Nombre: ${intent.getStringExtra("name")} ${intent.getStringExtra("surname")}")
        name.textSize = 30F
        val dni = TextView(this)
        dni.setText("DNI: ${intent.getStringExtra("dni")}")
        dni.textSize = 30F
        val birthday = TextView(this)
        birthday.setText("Fecha de Nacimiento: ${intent.getStringExtra("birthday")}")
        birthday.textSize = 30F
        val date = TextView(this)
        date.text=("Fecha de la Cita: ${intent.getStringExtra("date")}")
        date.textSize = 30F

        val btnBack = Button(this)
        btnBack.text = "Volver"

        linearLayout.addView(name)
        linearLayout.addView(dni)
        linearLayout.addView(birthday)
        linearLayout.addView(date)
        linearLayout.addView(btnBack)

        btnBack.setOnClickListener() {
            startActivity(Intent(this,MainActivity_2::class.java))
        }

        setContentView(rootView)
    }
}