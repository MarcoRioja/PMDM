package Examen

interface Jugable {
    fun jugar(nombreDeUsuario: String) {
        println("$nombreDeUsuario está jugando")
    }
}

interface SonidoAmbiente {
    fun reproducirSonido() {
        println("Se escucha el sonido ambiente")
    }
}

interface GuardadoPartida {
    fun guardarPartida() {
        println("Se ha guardado la partida")
    }
}

class Aventura : Jugable, SonidoAmbiente, GuardadoPartida {
    override fun jugar(nombreDeUsuario: String) {
        println("Iniciando juego de aventura: El Viaje Épico para el jugador $nombreDeUsuario")
    }

    override fun reproducirSonido() {
        println("Sonido misterioso de la aventura")
    }

    override fun guardarPartida() {
        println("Guardando el progeso del juego de aventura")
    }
}

class Deportes : Jugable, SonidoAmbiente, GuardadoPartida {
    override fun jugar(nombreDeUsuario: String) {
        println("Iniciando juego de Deportes: Campeonato Virtual para el jugador $nombreDeUsuario")
    }

    override fun reproducirSonido() {
        println("Sonidos emocionantes de la competicion deportiva")
    }

    override fun guardarPartida() {
        println("Guardando el progreso del partido")
    }
}

class Estrategia : Jugable, SonidoAmbiente, GuardadoPartida {
    override fun jugar(nombreDeUsuario: String) {
        println("Iniciando juego de estrategia: Reinos en Guerra para el jugador $nombreDeUsuario")
    }

    override fun reproducirSonido() {
        println("Sonidos tacticos del juego de estrategia")
    }

    override fun guardarPartida() {
        println("Guardando progreso del juego de estrategia")
    }
}

fun main() {
    var aventura = Aventura()
    aventura.jugar("Cristina")
    aventura.reproducirSonido()
    aventura.guardarPartida()

    println("-------------------- o --------------------")

    var deporte = Deportes()
    deporte.jugar("Alberto")
    deporte.reproducirSonido()
    deporte.guardarPartida()

    println("-------------------- o --------------------")

    var estrategia = Estrategia()
    estrategia.jugar("Laura")
    estrategia.reproducirSonido()
    estrategia.guardarPartida()
}