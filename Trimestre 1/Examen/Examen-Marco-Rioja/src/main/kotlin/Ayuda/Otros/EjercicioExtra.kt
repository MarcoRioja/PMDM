package Ayuda.Otros

import kotlin.random.Random

fun game() {
    var randomList = arrayListOf<Int>()
    for (i in 0..4) {
        randomList.add(Random.nextInt(0,10))
    }
    print(randomList.toString())

    var newList = arrayListOf<Int>()

    for (i in 0..4) {
        print("Introduce a numer")
        var number: Int? = readLine()?.toInt()
        if (randomList.contains(number) && number != null) {
            newList.add(number)
        }

        when (number) {
            1 -> println("Vamos bien")
            2 -> println("Poco a poco")
            3 -> println("Cada vez mas cerca")
            4 -> println("Vamooos!")
        }

        if (newList.size == 4) {
            return
        }
    }
}

fun main() {
    game()
}