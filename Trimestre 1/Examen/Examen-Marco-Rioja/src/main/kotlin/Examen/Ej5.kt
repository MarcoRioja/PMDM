package Examen

fun imprimirLista(lista: MutableList<Any>) {
    println("${(lista as ArrayList<String>).joinToString(", ")}")
}

fun main() {
    var centro: MutableList<Any>
    centro = mutableListOf(arrayListOf("Matemáticas","Alberto",5), arrayListOf("Lengua","Laura",6))

    println(" -------------------- Original -------------------- ")
    imprimirLista(centro)
    (centro [0] as ArrayList<Any>)[0] = "Historia"
    (centro [1] as ArrayList<Any>)[0] = "Física"
    println(" -------------------- Modificada -------------------- ")
    imprimirLista(centro)
    centro.add(arrayListOf("Química", "Cristina", 7))
    println(" -------------------- Añadida -------------------- ")
    imprimirLista(centro)
}