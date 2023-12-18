package com.example.myapplication.primerospasos.Ejercicios.Herencias.ToStringYHashCode.Ej3

open class Empresa(var nombre: String, var ubicacion: String) {
    fun realizarOperacionesGenerales() {
        println("Realizando omperaciones generales de $nombre");
    }
}

class Empleado(nombre: String, ubicacion: String, var puesto: String) : Empresa(nombre,ubicacion) {
    fun trabajar() {
        println("$puesto de $nombre esta trabajando");
    }
}

class Producto(nombre: String, ubicacion: String, var categoria: String) : Empresa(nombre,ubicacion) {
    fun producir() {
        println("Producto de $categoria produciendose");
    }
}

class Cliente(nombre: String, ubicacion: String, var tipo: String) : Empresa(nombre,ubicacion) {
    fun comprar() {
        println("Cliente $tipo comprando");
    }
}

fun main() {
    var nombreEmpresa = "Vortex";
    var ubicacionEmpresa = "Calle Mis Pantallas";
    var empleado = Empleado(nombreEmpresa, ubicacionEmpresa, "jefe");
    empleado.realizarOperacionesGenerales();
    empleado.trabajar();
    var producto = Producto(nombreEmpresa, ubicacionEmpresa, "comida");
    producto.producir();
    var cliente = Cliente(nombreEmpresa, ubicacionEmpresa, "compulsivo");
    cliente.comprar();
}