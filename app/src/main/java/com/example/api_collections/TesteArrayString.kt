package com.example.api_collections

fun main(){
    val nomes = Array(3){""}
    nomes [0] = "Maria"
    nomes [1] = "Zazá"
    nomes [2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("__________")
    nomes.sort()
    nomes.forEach { println(it) }



    val nomes2 = arrayOf("Maria", "zazá", "Jose")
    println("__________")
    nomes.sort()
    nomes.forEach { println(it) }
}