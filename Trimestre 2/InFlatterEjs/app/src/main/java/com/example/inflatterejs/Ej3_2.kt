package com.example.inflatterejs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ej3_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Inflar el diseño XML de la actividad de imágenes
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej32, null)
        setContentView(rootView)


        // Obtener referencias a los botones de imágenes
        val btnImage1 = findViewById<Button>(R.id.btnImage1)
        val btnImage2 = findViewById<Button>(R.id.btnImage2)
        val btnImage3 = findViewById<Button>(R.id.btnImage3)


        // Configurar clics de los botones para ir a la actividad del contenedor
        btnImage1.setOnClickListener { // Iniciar la actividad del contenedor con un mensaje específico
            startContainerActivity("Has seleccionado Imagen 1")
        }
        btnImage2.setOnClickListener { // Iniciar la actividad del contenedor con un mensaje específico
            startContainerActivity("Has seleccionado Imagen 2")
        }
        btnImage3.setOnClickListener { // Iniciar la actividad del contenedor con un mensaje específico
            startContainerActivity("Has seleccionado Imagen 3")
        }
    }


    private fun startContainerActivity(message: String) {
        val intent: Intent = Intent(
            this@Ej3_2,
            Ej3_3::class.java
        )
        intent.putExtra("message", message)
        startActivity(intent)
    }

}