package com.example.api_collections

fun main(){

    val joao = funcionario("Joao", 2000.00, "clt")
    val pedro = funcionario("Pedro", 1500.00, "pj")
    val mari = funcionario("Mari", 4000.00, "clt")

    val Funcionarios = listOf(joao, pedro, mari)

    Funcionarios.forEach{println(it)}

    println("____")
    println(Funcionarios.find{it.nome =="Mari"})

    println("____")
    Funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("____")
    Funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

