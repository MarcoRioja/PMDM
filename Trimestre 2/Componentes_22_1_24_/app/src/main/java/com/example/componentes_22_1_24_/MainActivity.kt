package com.example.componentes_22_1_24_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.componentes_22_1_24_.Result
import com.google.android.material.slider.RangeSlider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    private lateinit var tvIngresos: TextView
    private val incrementoDeIngresos = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rangeSlider = findViewById<RangeSlider>(R.id.rsEdad)
        val tvAnos = findViewById<TextView>(R.id.tvAnos)

        rangeSlider.addOnChangeListener { slider, value, fromUser ->
            // Actualiza el texto del TextView con el valor seleccionado
            tvAnos.text = "${value.toInt()} años"
        }

        val btnMayor = findViewById<FloatingActionButton>(R.id.btnMayor)
        val btnMenor = findViewById<FloatingActionButton>(R.id.btnMenor)
        tvIngresos = findViewById(R.id.tvIngresos)

        btnMayor.setOnClickListener {
            aumentarIngresos()
        }

        btnMenor.setOnClickListener {
            disminuirIngresos()
        }

        val btnNext = findViewById<Button>(R.id.btnNext)
        val resultIntent = Intent(this,Result::class.java)
        btnNext.setOnClickListener() {

        }

    }

    private fun aumentarIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual + incrementoDeIngresos

        // Asegura que el nuevo valor no exceda el límite superior
        if (nuevoValor <= Int.MAX_VALUE) {
            tvIngresos.text = nuevoValor.toString()
        }
    }
    private fun disminuirIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual - incrementoDeIngresos

        // Asegura que el nuevo valor no sea inferior a cero
        if (nuevoValor >= 0) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

}