package vtx.mk.simulacropmmercidev_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etapellidos=findViewById<EditText>(R.id.etapellidos)
        val etDirection=findViewById<EditText>(R.id.etDireccion)
        val etCp=findViewById<EditText>(R.id.etCp)
        val etCiudad=findViewById<EditText>(R.id.etCiudad)
        val etProvincia=findViewById<EditText>(R.id.etProvincia)
        val etTelefono=findViewById<EditText>(R.id.etTelefono)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etapellidos.text.toString()
            val direccion = etDirection.text.toString()
            val cp = etCp.text.toString()
            val ciudad = etCiudad.text.toString()
            val provincida = etProvincia.text.toString()
            val tlf = etTelefono.text.toString()
            dataManager.addPerson(nombre,apellidos,direccion,cp,ciudad,provincida,tlf)
            Toast.makeText(this, "Se agregó a la base de datos: $nombre", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
            etapellidos.text.clear() //limpiamos el compononente editext
            etDirection.text.clear() //limpiamos el compononente editext
            etCp.text.clear() //limpiamos el compononente editext
            etCiudad.text.clear() //limpiamos el compononente editext
            etProvincia.text.clear() //limpiamos el compononente editext
            etTelefono.text.clear() //limpiamos el compononente editext
        }
        btnEliminar.setOnClickListener {
            val nombre = etNombre.text.toString()
            dataManager.deleteAll()
            Toast.makeText(this, "Se eliminó de la base de datos: $nombre", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
            etapellidos.text.clear() //limpiamos el compononente editext
            etDirection.text.clear() //limpiamos el compononente editext
            etCp.text.clear() //limpiamos el compononente editext
            etCiudad.text.clear() //limpiamos el compononente editext
            etProvincia.text.clear() //limpiamos el compononente editext
            etTelefono.text.clear() //limpiamos el compononente editext
        }
        // muestra todos los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val nombres = dataManager.getAllUsers(this)
            tvMuestraNombre.text = nombres //nos muestra los nombres que hay en la tabla
        }
    }
}
