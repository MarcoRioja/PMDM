package vtx.mk.ficheros

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Activity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento2)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)

        btnLeerArchivo.setOnClickListener {
            leerArchivo()
        }

        val btnCrearArchivo: Button = findViewById(R.id.btnCrearArchivo)

        btnCrearArchivo.setOnClickListener {
            crearArchivo()
        }
    }

    private fun crearArchivo() {
        try {
            val fileName = "MarcoElMaravilloso"
            val fileContent = "Claro que si"

            // Abrir un OutputStreamWriter en el modo privado (solo accesible por esta aplicación)
            var osw: OutputStreamWriter = OutputStreamWriter(openFileOutput(fileName, MODE_PRIVATE))

            // Escribir el contenido en el archivo
            osw.write(fileContent)

            // Limpiar y cerrar el OutputStreamWriter
            osw.flush() //limpiamos
            osw.close() //cerramos

            Log.d("Éxito", "Archivo creado con éxito!")
        } catch (e: Exception) {
            Log.e("Error", "Error al usar OutputStreamWriter: " + e.message)
        }
    }

    private fun leerArchivo() {
        try {
            val fileName = "MarcoElMaravilloso"

            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            // Leer la primera línea del archivo
            val texto = br.readLine()

            // Cerrar el BufferedReader
            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")
            val textV: TextView = findViewById(R.id.text)
            textV.setText(texto)


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}
