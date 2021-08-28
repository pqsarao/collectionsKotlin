package com.example.api_collections

fun main(){
    val joao = funcionario("Joao", 2000.00, "clt")
    val pedro = funcionario("Pedro", 1500.00, "pj")
    val mari = funcionario("Mari", 4000.00, "clt")

    println("____LIST____")
    val funcionarios = mutableListOf(joao, mari)
    funcionarios.forEach{println(it)}

    println("________")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("________")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("____SET____")
    val funcionarioSet = mutableSetOf(joao)
    //funcionarioSet.forEach{println(it)}

    println("________")
    funcionarioSet.add(pedro)
    funcionarioSet.add(mari)
funcionarioSet.forEach{println(it)}

    println("________")
    funcionarioSet.remove(mari)
    funcionarioSet.forEach{println(it)}
}