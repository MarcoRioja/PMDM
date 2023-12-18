package com.example.myapplication.primerospasos.Ejercicios.Arrays

fun Ejercicios() {
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }

    for (i in arrayValores.size - 1 downTo 0 step 2) {
        println(arrayValores[i])
    }

    val arrayValores1 = arrayOf(1, "España", 2, "Francia", 3, "Alemania", 4, "Italia", 5)
    for (i in 0 until arrayValores1.size step 1) {
        println(arrayValores1[i])
    }

    val arrayFloat = floatArrayOf(3.5F, 2.2f)
    for (i in 0 until arrayFloat.size step 1) {
        println(arrayFloat[i])
    }

    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Málaga"
    arrayVacio[1] = "Sevilla"
    arrayVacio[2] = "Cádiz"
    for (i in 0 until arrayVacio.size step 1) {
        println(arrayVacio[i])
    }

    val arrayVacio1: Array<Any?> = arrayOfNulls(3)
    arrayVacio1[0] = 42
    arrayVacio1[1] = "Hola"
    arrayVacio1[2] = 3
    println(arrayVacio1.joinToString(", "))

}

fun Matrices() {
    val array2d = arrayOf(arrayOf(3, 3, 3), arrayOf("aaa", "ccc", -1))

    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }

    var matrizEnteros = arrayOf(intArrayOf(3, 2, 1), intArrayOf(4, 5), intArrayOf(6))
    println("Valor original " + matrizEnteros[0][2])
    matrizEnteros[0][2] = 0
    println(" valor cambiado a " + matrizEnteros[0][2])
    matrizEnteros[0].set(2, 9);
    println("valor cambiado con set " + matrizEnteros[0][2])

    var matrizEnteros1 = arrayOf(floatArrayOf(3f, 2f, 1.4f), intArrayOf(3, 2), intArrayOf(1))
    (matrizEnteros1[0] as FloatArray).set(2, 1.5f);
    // casteando
    var miArray8 = arrayOf(arrayOf(3, -1, 4.5f), arrayOf(3, -1, 4.5f), -1)


    for (fila in miArray8) {
        if (fila is Array<*>) {
            for (valor in fila as Array<*>) {
                println("valor array: $valor")
            }
        } else if (fila is Int) {
            println("valor int: $fila")
        }
    }

    var matriz = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    (matriz[0] as Array<Any>)[1] = 4 as Any
    println("Matriz valor: ${matriz[0][1]}")


    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            if (matriz[i][j] is Int) {
                (matriz[i] as Array<Any>)[j] = (((matriz[i] as Array<Any>)[j] as Int).inc() as Any)
            }
        }
    }

    // Mostrar la matriz después de la modificación
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
//mostrando todo el contenido de un array
    var matriz10 = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    println(matriz10.contentDeepToString())

}

