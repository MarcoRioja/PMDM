package com.example.myapplication.primerospasos.Ejercicios.Herencias.ToString

open class CursoEscolar(var curso: String, var calendario: String,
                        var centro: String, var codigo: Int) {

}
class Asignatura(curso: String, calendario: String, centro: String, codigo: Int,
                 var asignatura: String): CursoEscolar(curso,calendario,centro, codigo){
    override fun toString(): String {

        return ("La asignatura es $asignatura")
    }

}
fun main(){
    val asignatura1=Asignatura("1º DAMc","2023-2024","CENEC",1,"MARCAS")
    println(asignatura1)
}

