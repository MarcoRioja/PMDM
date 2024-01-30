package com.example.inflatterejs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ej3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Inflar el diseño XML de la actividad principal
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej3, null)
        setContentView(rootView)


        // Obtener referencia al botón en la actividad principal
        val btnGoToImages = findViewById<Button>(R.id.btnGoToImages)


        // Configurar el clic del botón para ir a la actividad de imágenes
        btnGoToImages.setOnClickListener { // Iniciar la actividad de imágenes
            val intent: Intent = Intent(
                this@Ej3,
                Ej3_2::class.java
            )
            startActivity(intent)
        }
    }

}