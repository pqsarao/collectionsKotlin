package com.example.api_collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2570.50, 3200.00)

    for (salario in salarios){
        println(salario)
    }

    println("----------")
    println("maior salario: ${salarios.maxOrNull()}")
    println("menor salario: ${salarios.minOrNull()}")
    println("média salarios: ${salarios.average()}")


    val salariosMaiorQue1500 = salarios.filter { it >1500.0 }
    println("----------")
    salariosMaiorQue1500.forEach{println(it)}

    println("----------")
    println(salarios.count {it in 2000.00.. 7000.00})

    println("----------")
    println(salarios.count {it == 25.750})

    println("----------")
    println(salarios.any {it == 1000.00})

    println("----------")
    println(salarios.any {it == 500.00})
}