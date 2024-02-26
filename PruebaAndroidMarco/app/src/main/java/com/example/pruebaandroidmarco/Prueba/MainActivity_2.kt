package com.example.pruebaandroidmarco.Prueba

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.pruebaandroidmarco.R
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class MainActivity_2 : AppCompatActivity() {

    private lateinit var calendar: Calendar

    lateinit var nameEditText: EditText
    lateinit var surnameEditText: EditText
    lateinit var dniEditText: EditText
    lateinit var birthdayDateTextView: TextView
    lateinit var birthdayDateBtn: Button
    lateinit var dateDateTextView: TextView
    lateinit var dateDateBtn: Button
    lateinit var urgBtn: CardView

    var nameText = ""
    var surnameText = ""
    var dniText = ""
    var birthdayText = ""
    var dateText = ""

    lateinit var cardNext: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main2)

        val resultPage = Intent(this,ResultActivity::class.java)

        calendar = Calendar.getInstance()

        nameEditText = findViewById<EditText>(R.id.nameText)
        surnameEditText = findViewById<EditText>(R.id.surnameText)
        dniEditText = findViewById<EditText>(R.id.dniText)
        birthdayDateTextView = findViewById<EditText>(R.id.birthdayTextView)
        birthdayDateBtn = findViewById<Button>(R.id.birthdayDate)
        dateDateTextView = findViewById<EditText>(R.id.dateTextView)
        dateDateBtn = findViewById<Button>(R.id.dateDate)
        urgBtn = findViewById<CardView>(R.id.btnUrg)

        birthdayDateBtn.setOnClickListener() {
            showDatePicker(birthdayDateTextView)
        }

        dateDateBtn.setOnClickListener() {
            showDatePicker(dateDateTextView)
        }

        urgBtn.setOnClickListener() {
            nameText = nameEditText.text.toString()
            surnameText = surnameEditText.text.toString()
            dniText = dniEditText.text.toString()
            birthdayText = birthdayDateTextView.text.toString()
            dateText = dateDateTextView.text.toString()

            val primaryDataBool = !(isEmpty(nameText) || isEmpty(surnameText) || isEmpty(dniText) ||
                    isEmpty(birthdayText))
            val secondaryDataBool = !isEmpty(dateText)

            if (primaryDataBool) {


                resultPage.putExtra("name",nameText)
                resultPage.putExtra("surname",surnameText)
                resultPage.putExtra("dni",dniText)
                resultPage.putExtra("birthday",birthdayText)

                val calendar = Calendar.getInstance()
                val date: Date = calendar.time
                val sdf: SimpleDateFormat
                sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                sdf.timeZone = TimeZone.getTimeZone("España/Madrid")
                resultPage.putExtra("date", sdf.format(date))

                createFile(" - Nombre: $nameText, Apellidos: $surnameText, DNI: $dniText, Fecha de Nacimiento: $birthdayText, Fecha de Cita: ${sdf.format(date)} -")
                startActivity(resultPage)
            }
            else {
                Toast.makeText(this,"Rellena los datos marcados con * para continuar",Toast.LENGTH_SHORT).show()
            }
        }

        cardNext = findViewById<CardView>(R.id.cardNext)
        cardNext.setOnClickListener() {
            nameText = nameEditText.text.toString()
            surnameText = surnameEditText.text.toString()
            dniText = dniEditText.text.toString()
            birthdayText = birthdayDateTextView.text.toString()
            dateText = dateDateTextView.text.toString()

            val primaryDataBool = !(isEmpty(nameText) || isEmpty(surnameText) || isEmpty(dniText) ||
                    isEmpty(birthdayText))
            val secondaryDataBool = !isEmpty(dateText)

            if (primaryDataBool && secondaryDataBool) {
                createFile(" - Nombre: $nameText, Apellidos: $surnameText, DNI: $dniText, Fecha de Nacimiento: $birthdayText, Fecha de Cita: $dateText -")

                resultPage.putExtra("name",nameText)
                resultPage.putExtra("surname",surnameText)
                resultPage.putExtra("dni",dniText)
                resultPage.putExtra("birthday",birthdayText)
                resultPage.putExtra("date", dateText)

                startActivity(resultPage)
            }
            else {
                Toast.makeText(this,"Rellena todos los datos para continuar",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isEmpty(text: String): Boolean {
        return text.replace(" ","").equals("")
    }

    private fun showDatePicker(text: TextView) {
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, month, dayOfMonth ->
                calendar.set(year, month, dayOfMonth)
                updateDate(text)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.show()
    }

    private fun updateDate(text: TextView) {
        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        text.setText(sdf.format(calendar.time))
    }

    private fun createFile(text: String) {
        try {
            val fileName = "date_info"
                var osw: OutputStreamWriter = OutputStreamWriter(openFileOutput(fileName, MODE_PRIVATE))

                osw.write(text)

                osw.flush()
                osw.close()

                Log.d("Éxito", "Archivo creado con éxito!")
                readFile("date_info")

        } catch (e: Exception) {
            Log.e("Error", "Error al usar OutputStreamWriter: " + e.message)
        }
    }

    private fun readFile(name: String) {
        try {
            val fileName = name

            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            var lines: ArrayList<String> = ArrayList()
            br.forEachLine {
                lines.add(it)
            }

            br.close()

            Log.d("Éxito", "Contenido del archivo: ")
            for (line in lines) {
                Log.d("Línea",line)
            }

        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}