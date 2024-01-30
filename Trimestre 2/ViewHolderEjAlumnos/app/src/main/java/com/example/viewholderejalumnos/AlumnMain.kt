package com.example.viewholderejalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vtx.viewholder.Ej1.AlumnAdapter
import vtx.viewholder.Ej1.Person

class AlumnMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val alumnAdapter = AlumnAdapter(personList)
        recyclerView.adapter = alumnAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto","Mates",5),
            Person("Juan","Lengua",7),
            Person("Eva","Sociales",10),
            Person("Alberto","Religion",4),
            Person("Laura","Mates",3),
            Person("Cristina","Lengua",8),
            Person("Isabel","Religion",7),
            Person("Pedro","Lengua",6),
            Person("Jose","Mates",5),
            Person("Manuel","Sociales",9),
            Person("Diana","Sociales",1),

            )
    }
}