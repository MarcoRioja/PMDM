package com.example.myapplication.primerospasos.Ejercicios.Herencias.ToStringYHashCode.Ej1

open class Vehiculo(var marca: String, var modelo: String) {

    fun acelerar() {
        println("$modelo acelerando.");
    }

    fun frenar() {
        println("$modelo frenando.");
    }

    open fun conducir() {
        println("$modelo conduciendo.");
    }
}

class Coche(marca: String, modelo: String,var numeroPuertas: Int) : Vehiculo(marca,modelo) {
    override fun conducir() {
        println("Conduciendo un $modelo de $numeroPuertas puertas.");
    }
}

class Motocicleta(marca: String, modelo: String, var tipoDeMotocicleta: String) : Vehiculo(marca,modelo) {
    fun hacerCaballito() {
        println("La motocicleta $modelo, de tipo $tipoDeMotocicleta está haciendo un caballito");
    }
}

fun main() {
    var coche = Coche("KAI","Caren",5);
    var moto = Motocicleta("Llamaja","Supre","Carreras");

    coche.conducir();
    coche.acelerar();
    coche.frenar();
    moto.conducir();
    moto.hacerCaballito();
}