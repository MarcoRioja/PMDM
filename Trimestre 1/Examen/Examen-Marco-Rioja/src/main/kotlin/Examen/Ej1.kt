package Examen

fun main() {
    var empleados = arrayOf(
        arrayOf<String>("Juan", "Eva", "Ana", "Pedro"),
        floatArrayOf(1700f, 2800f, 1900f, 2300f)
    )

    val nombres = empleados[0] as Array<*>
    val salarios = empleados[1] as FloatArray
    val salarioSuma = salarios.sum()
    val salarioMedio = salarioSuma/salarios.size

    println("Nombres: ${nombres.joinToString(", ")}")
    println("Salarios: ${salarios.joinToString("€, ")}€")
    println("Salario Medio: $salarioMedio€")
    println("Salario Suma: $salarioSuma€")
}