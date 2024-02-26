package vtx.mk.ficheros

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class Reto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento2)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)

        btnLeerArchivo.setOnClickListener {
            leerArchivo()
        }
    }

    private fun leerArchivo() {
        try {
            val fileName = "Alberto el grande"

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
