package com.example.myapplication.primerospasos.Ejercicios.Herencias.Animal

// Clase base (superclase)
open class Animal(val nombre: String, val edad: Int) {
    fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

// Clase derivada (subclase) que hereda de Animal
class Perro(nombre: String, edad: Int, val raza: String) : Animal(nombre, edad) {
    fun ladrar() {
        println("Guau, guau!")
    }
}

// Clase base (superclase)
open class Vehiculo(val modelo: String, val año: Int) {
    fun conducir() {
        println("El vehículo está en movimiento")
    }
}

// Clase derivada (subclase) que hereda de Vehiculo
class Coche(modelo: String, año: Int, val fabricante: String) : Vehiculo(modelo, año) {
    fun hacerSonido() {
        println("El coche hace un sonido de motor")
    }
}

fun main() {
    // Crear una instancia de la clase derivada (Coche)
    val miCoche = Coche("Civic", 2022, "Honda")

    // Acceder a las propiedades y métodos de la clase base (Vehiculo)
    println("Modelo: ${miCoche.modelo}")
    println("Año: ${miCoche.año}")

    // Acceder a las propiedades y métodos de la clase derivada (Coche)
    println("Fabricante: ${miCoche.fabricante}")

    // Llamar a un método de la clase base
    miCoche.conducir()

    // Llamar a un método de la clase derivada
    miCoche.hacerSonido()
}

