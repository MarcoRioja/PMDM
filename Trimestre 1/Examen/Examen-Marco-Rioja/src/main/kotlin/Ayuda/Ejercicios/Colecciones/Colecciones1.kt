package com.example.myapplication.primerospasos.Ejercicios.Colecciones

// Definición del enum DiasDeLaSemana
enum class DiasDeLaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
}

fun main() {
    // Crear una variable que represente el día actual
    val diaActual = DiasDeLaSemana.MIÉRCOLES

    // Mostrar un mensaje indicando qué día de la semana es hoy
    when (diaActual) {
        DiasDeLaSemana.LUNES -> println("¡Es lunes!")
        DiasDeLaSemana.MARTES -> println("¡Es martes!")
        DiasDeLaSemana.MIÉRCOLES -> println("¡Es miércoles!")
        DiasDeLaSemana.JUEVES -> println("¡Es jueves!")
        DiasDeLaSemana.VIERNES -> println("¡Es viernes!")
        DiasDeLaSemana.SÁBADO -> println("¡Es sábado!")
        DiasDeLaSemana.DOMINGO -> println("¡Es domingo!")
    }
}

fun main1(){
    var col: List<Int>
    col= listOf(1,2,3,4,5,6)

    //accedemos al primer elemento
    val primerElemento = col.get(0)

    for (element in col) {
        println(element)
    }

}

// ejercicio usando mutable
fun printbucle(listar: List<Int> ){
    for (colum in listar){
        println(colum)
    }
}
fun main2() {
    // en este ejemplo podemos añadir otro valor el 3 al final del list
    var col1: List<Int>
    col1= mutableListOf(31,32,33,34,35,36)
    //añadimos un valor nuevo
    println("Añadimos un nuevo valor 3")
    col1.add(3)
    printbucle(col1)
    //modificamos un valor
    println("modificamos el valor del indice 0")
    col1[0]=311
    printbucle(col1)
}