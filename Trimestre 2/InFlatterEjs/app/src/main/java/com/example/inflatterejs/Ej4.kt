package com.example.inflatterejs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Ej4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflar el diseño XML
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_ej4, null)

        // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)
        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)

        // Crear un nuevo TextView dinámicamente
        val nuevoTextView = TextView(this)
        nuevoTextView.text = "Hola, Alberto"

        // Agregar el nuevo TextView al contenedor
        linearLayout.addView(nuevoTextView)

        // Establecer la vista inflada en la actividad
        setContentView(rootView)
    }

}