package com.example.myapplication.primerospasos.Ejercicios.Herencias.ToStringYHashCode.Ej2

open class ProductoInformatico( var nombre: String, var precio: Float) {
    fun encender() {
        println("$nombre encendido");
    }

    fun apagar() {
        println("$nombre apagandose");
    }

    open fun ejecutar() {
        println("$nombre ejecutandose");
    }
}

class Laptop(nombre: String, precio: Float, var marca: String) : ProductoInformatico(nombre, precio) {
    override fun ejecutar() {
        println("$marca $nombre ejecutandose");
    }
}

class Impresora(nombre: String, precio: Float, var tipo: String) : ProductoInformatico(nombre, precio) {
    fun imprimir() {
        println("Impresora $nombre imprimiendo");
    }
}

fun main() {
    var laptop = Laptop("Marco", 200f,"Asur");
    var impresora = Impresora("Yoy", 300f, "rata");

    laptop.encender();
    laptop.apagar();
    laptop.ejecutar();
    impresora.ejecutar();
    impresora.imprimir();
}