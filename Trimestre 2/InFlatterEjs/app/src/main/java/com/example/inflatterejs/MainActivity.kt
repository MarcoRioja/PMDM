package com.example.inflatterejs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño XML
        val rootView = LayoutInflater.from(this).inflate(R.layout.activity_main, null)


        // Configurar cualquier acción adicional si es necesario
        // ...


        // Establecer la vista inflada en la actividad
        setContentView(rootView)


        // Puedes acceder directamente a las vistas infladas gracias al plugin 'kotlin-android-extensions'
        // No necesitas findViewById en este caso
        // textView.text = "Hola, soy un TextView"
    }

}