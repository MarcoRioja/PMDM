package com.example.simulacroejercicio2

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


class MainActivity : AppCompatActivity() {
    private var opcionSeleccionada: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Create","App iniciada")

        val tittle = findViewById<TextView>(R.id.Login)
        val mSpannableString = SpannableString(tittle.text)

        mSpannableString.setSpan(UnderlineSpan(), 0, mSpannableString.length, 0)
        tittle.text = mSpannableString

        val btnNext = findViewById<Button>(R.id.btnEntrar)
        val etName = findViewById<EditText>(R.id.Nombre)
        val etPassword = findViewById<EditText>(R.id.Contraseña)
        val etDate = findViewById<EditText>(R.id.Fecha)

        val btnDate = findViewById<Button>(R.id.btnFecha)

        val dateUrg = findViewById<CardView>(R.id.cv)
        val selectedDate = Calendar.getInstance()

        dateUrg.setOnClickListener {
            handleCardViewClick(dateUrg)
        }
        btnDate.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this,
                { _, year, month, dayOfMonth ->
                    selectedDate.set(year, month, dayOfMonth)
                    actualizarCampoFecha(etDate,selectedDate)
                },
                selectedDate.get(Calendar.YEAR),
                selectedDate.get(Calendar.MONTH),
                selectedDate.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }
        btnNext.setOnClickListener {
            val password = etPassword.text.toString()
            val name = etName.text.toString()
            val date = etDate.text.toString()

            if (password.isNotEmpty() && name.isNotEmpty() &&
                date.isNotEmpty()
            ) {
                Log.d("Datos","Datos insertados correctamente")
                Toast.makeText(this, "El texto es correcto", Toast.LENGTH_LONG).show()
                val intent = Intent(this, SegundaPantalla::class.java)
                intent.putExtra("EXTRA_CONTRA", password)
                intent.putExtra("EXTRA_NOMBRE", name)
                intent.putExtra("EXTRA_FECHA", date)
                intent.putExtra("EXTRA_CITA",opcionSeleccionada)
                startActivity(intent)
            }else{
                Log.e("Error","Faltan rellenar campos")
                Toast.makeText(this,"Los datos son incorrectos",Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun handleCardViewClick(cardView: CardView) {
        when (cardView.id) {
            R.id.cv -> {
                println("Se ha pulsado cardview1")
                Log.d("CardView", "Has pulsado el cardview1")
                opcionSeleccionada = "CITA URGENTE SOLICITADA"
            }
        }
    }
    private fun actualizarCampoFecha(etF:EditText, sd:Calendar) {
        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        etF.setText(sdf.format(sd.time))
    }
}