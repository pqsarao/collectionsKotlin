package com.example.api_collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 5000.00
    salarios[2] = 10000.00

    salarios.forEach { println(it) }

    println("__________")
    salarios.forEachIndexed { index, salario ->
        salarios [index] = salario * 1.1

}
    salarios.forEach { println(it) }

    println("__________")
    val salarios2 = doubleArrayOf(1300.0, 42426.0, 5400.30)
    salarios2.sort()
    salarios2.forEach { println(it) }
}