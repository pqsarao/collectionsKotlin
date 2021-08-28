package com.example.api_collections

fun main() {

    val joao = funcionario("Joao", 2000.00, "clt")
    val pedro = funcionario("Pedro", 1500.00, "pj")
    val mari = funcionario("Mari", 4000.00, "clt")

    val Funcionaros1 = setOf(joao, pedro)
    val Funcionarios2 = setOf(mari)
    
    val resultUnion = Funcionaros1.union(Funcionarios2)
    resultUnion.forEach{println(it)}

    println("----------")
    val Funcionarios3 = setOf(joao, pedro, mari)
    val resultSubtract = Funcionarios3.subtract(Funcionarios2)
    resultSubtract.forEach{println(it)}

    println("----------")
    val resultIntersect = Funcionarios3.intersect(Funcionarios2)
    resultIntersect.forEach{println(it)}

    }
