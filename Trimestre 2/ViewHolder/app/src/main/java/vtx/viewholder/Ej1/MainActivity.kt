package vtx.viewholder.Ej1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vtx.viewholder.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val personAdapter = PersonAdapter(personList)
        recyclerView.adapter = personAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto",22),
            Person("Juan",34),
            Person("Eva",54),
            Person("Alberto",32),
            Person("Laura",14),
            Person("Cristina",89),
            Person("Isabel",54),
            Person("Pedro",76),
            Person("Jose",54),
            Person("Manuel",76),
            Person("Diana",32),

            )
    }
}