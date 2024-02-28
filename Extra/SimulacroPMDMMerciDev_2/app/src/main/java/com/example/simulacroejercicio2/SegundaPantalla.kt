package com.example.simulacroejercicio2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_segunda_pantalla, null)
        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayout)

        val name: String = intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        val password:String = intent.extras?.getString("EXTRA_CONTRA").orEmpty()
        val date:String = intent.extras?.getString("EXTRA_FECHA").orEmpty()

        val dateUrg:String = intent.extras?.getString("EXTRA_CITA").orEmpty()

        val tvName= TextView(this)
        val tvPass = TextView(this)
        val tvDate = TextView(this)
        val tvDateC = TextView(this)

        tvName.text="Nombre: $name"
        tvPass.text="contra: $password"
        tvDate.text="Fecha: $date"
        tvDateC.text="$dateUrg"

        tvName.textSize= 30F
        tvPass.textSize= 30F
        tvDate.textSize= 30F
        tvDateC.textSize= 30F

        linearLayout.addView(tvName)
        linearLayout.addView(tvPass)
        linearLayout.addView(tvDate)
        linearLayout.addView(tvDateC)
        setContentView(rootView)
    }
}