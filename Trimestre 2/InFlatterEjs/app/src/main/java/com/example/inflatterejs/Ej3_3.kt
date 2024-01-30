package com.example.inflatterejs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Ej3_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Inflar el diseño XML de la actividad del contenedor
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej33, null)
        setContentView(rootView)


        // Obtener referencia al TextView en la actividad del contenedor
        val tvContainerText = findViewById<TextView>(R.id.tvContainerText)


        // Obtener el mensaje de la actividad anterior
        val message = intent.getStringExtra("message")


        // Configurar el texto del TextView con el mensaje
        tvContainerText.text = message
    }

}