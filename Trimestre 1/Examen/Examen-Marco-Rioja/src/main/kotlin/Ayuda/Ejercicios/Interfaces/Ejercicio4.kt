package com.example.myapplication.primerospasos.Ejercicios.Interfaces

// Definición de la interfaz Persona
interface PersonaCliente {
    val nombre: String
    val edad: Int

    fun presentarse() {
    }
}

// Definición de la interfaz Cliente
interface Cliente {
    val numeroCliente: String

    fun realizarCompra() {
        println("Cliente $numeroCliente realizando una compra.")
    }
}

// Clase que implementa ambas interfaces
class ClientePremium(
    override val nombre: String,
    override val edad: Int,
    override val numeroCliente: String
) : PersonaCliente, Cliente {
    // Implementación de la función presentarse de la interfaz Persona
    override fun presentarse() {
        super<PersonaCliente>.presentarse()
        println("Soy un cliente premium.")
    }

    // No es necesario implementar realizarCompra, ya que tiene una implementación por defecto en la interfaz Cliente
}

fun main() {
    // Crear una instancia de ClientePremium
    val clientePremium = ClientePremium("Carlos", 30, "12345")

    // Llamar a métodos de ambas interfaces y la implementación específica de la clase
    clientePremium.presentarse()
    clientePremium.realizarCompra()
}
