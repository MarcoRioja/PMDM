package com.example.inflatterejs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Ej2_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño XML de la segunda actividad
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej22, null)
        setContentView(rootView)

        // Obtener referencia al TextView y al botón en la segunda actividad
        val textViewSecondActivity = findViewById<TextView>(R.id.textViewSecondActivity)
        val btnBackToMainActivity = findViewById<Button>(R.id.btnOpenMainActivity)

        // Configurar el texto del TextView
        textViewSecondActivity.text = "¡Bienvenido a la Segunda Actividad!"

        // Configurar el clic del botón para volver a la actividad principal
        btnBackToMainActivity.setOnClickListener { // Finalizar la segunda actividad y volver a la actividad principal
            finish()
        }
    }
}