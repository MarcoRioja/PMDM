package com.example.inflatterejs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ej2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño XML de la actividad
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej2, null)
        setContentView(rootView)

        // Obtener referencia al botón en la actividad
        val btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)

        // Verificar si el botón es nulo antes de configurar el clic
        btnOpenSecondActivity?.setOnClickListener { // Iniciar SecondActivity2
            val intent: Intent = Intent(
                this@Ej2,
                Ej2_2::class.java
            )
            startActivity(intent)
        }
    }
}