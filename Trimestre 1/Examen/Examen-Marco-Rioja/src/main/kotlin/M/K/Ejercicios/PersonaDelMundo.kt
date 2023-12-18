package com.example.myapplication.primerospasos.Ejercicios

class PersonaDelMundo(val nombre: String, val apellidos: String, val edad: Int) {
    constructor(nombre: String, apellidos: String) : this(nombre, apellidos, 0)
    constructor() : this("Marco", "Rioja", 20)
    constructor(nombre: String, edad: Int) : this(nombre, "Berto", edad)

    fun toStringP() {
        println("Nombre: $nombre")
        println("Apellido: $apellidos")
        println("Edad: $edad")
    }
}

fun main() {
    var persona1 = PersonaDelMundo()
    var persona2 = PersonaDelMundo("Berto","Pinomo")

    persona1.toStringP();
    persona2.toStringP()
}



