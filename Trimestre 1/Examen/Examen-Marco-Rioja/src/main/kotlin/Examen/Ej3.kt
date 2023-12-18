package Examen

open class Deporte(var nombre: String, var tipoTerreno: String) {
    open fun mostrarDetalles() {
        println("Nombre: $nombre - Tipo de Terreno: $tipoTerreno")
    }
}

class Futbol(nombre: String, tipoTerreno: String, var numeroJugadores: Int, var esCampoGrande: Boolean) : Deporte(nombre,tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Numero de Jugadores: $numeroJugadores - Es Campo Grande: $esCampoGrande")
    }
}

class Baloncesto(nombre: String, tipoTerreno: String, var alturaCanasta: Float, var esDeporteEquipo: Boolean) : Deporte(nombre,tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Altura Canasta: $alturaCanasta mestros - Es Deporte Equipo: $esDeporteEquipo")
    }
}

class Balonmano(nombre: String, tipoTerreno: String, var esDeporteOlimpico: Boolean, var esContacto: Boolean) : Deporte(nombre,tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Es Deporte Olimpico: $esDeporteOlimpico - Es Contacto: $esContacto")
    }
}

class Voleibol(nombre: String, tipoTerreno: String, var esDeportePlaya: Boolean, var numeroJugadoresEquipo: Int) : Deporte(nombre,tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Es Deporte Playa: $esDeportePlaya - Numero de Jugadores Equipo: $numeroJugadoresEquipo")
    }
}

fun main() {
    var futbol = Futbol("Fútbol",  "Campo", 11, true)
    futbol.mostrarDetalles()
    println("---------- o ----------")
    var baloncesto = Baloncesto("Baloncesto", "Pista", 3.05f, true)
    baloncesto.mostrarDetalles()
    println("---------- o ----------")
    var balonmano = Balonmano("Balonmano", "Pista", true, true)
    balonmano.mostrarDetalles()
    println("---------- o ----------")
    var voleibol = Voleibol("Volebol", "Arena", true, 6)
    voleibol.mostrarDetalles()
}