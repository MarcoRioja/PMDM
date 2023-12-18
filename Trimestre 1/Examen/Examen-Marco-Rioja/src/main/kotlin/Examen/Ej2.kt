package Examen

import kotlin.random.Random

fun main() {

    print("Introduce un numero de partidas a jugar: ")
    val partidas = readLine()?.toIntOrNull() ?: 0

    var jugadorPartidasGanadas: Int = 0
    var machinaPartidasGanadas: Int = 0

    repeat(partidas) {
        println("----- Partida ${it+1} -----")
        var seleccion: String = ""
        while (seleccion != "Piedra" && seleccion != "Papel" && seleccion != "Tijera") {
            println("¿Piedra, Papel o Tijera?")
            seleccion = readLine() as String
        }

        var machinaSeleccionNum = Random.nextInt(1,4)
        var machinaSeleccion = ""
        when (machinaSeleccionNum) {
            1 -> machinaSeleccion = "Piedra"
            2 -> machinaSeleccion = "Papel"
            3 -> machinaSeleccion = "Tijera"
        }

        println("Jugador($seleccion) vs Machina($machinaSeleccion)")

        var ganador = ""

        when (machinaSeleccion) {
            "Piedra" -> {
                if (seleccion == "Papel") { jugadorPartidasGanadas++; println("Jugador Gana") }
                else if (seleccion == "Tijera") { machinaPartidasGanadas++; println("Machina Gana") }
                else {println("Empate") }
                }
            "Papel" -> {
                if (seleccion == "Tijera") { jugadorPartidasGanadas++; println("Jugador Gana") }
                else if (seleccion == "Piedra") { machinaPartidasGanadas++; println("Machina Gana") }
                else {println("Empate") }
            }
            "Tijera" -> {
                if (seleccion == "Piedra") { jugadorPartidasGanadas++; println("Jugador Gana") }
                else if (seleccion == "Papel") { machinaPartidasGanadas++; println("Machina Gana") }
                else {println("Empate") }
            }
        }

        println()
    }

    println("----- Resultado Final -----\nJ($jugadorPartidasGanadas) vs M($machinaPartidasGanadas)")
    if (jugadorPartidasGanadas > machinaPartidasGanadas) { println("Jugador gana") }
    else if (jugadorPartidasGanadas < machinaPartidasGanadas) { println("Machina gana")}
    else { println("Empate")}
}