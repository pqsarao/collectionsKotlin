package com.example.api_collections

fun main(){
    val joao = funcionario("Joao", 2000.00, "clt")
    val pedro = funcionario("Pedro", 1500.00, "pj")
    val mari = funcionario("Mari", 4000.00, "clt")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(mari.nome, mari)

    println(repositorio.findById(joao.nome))

    println("_________")
    repositorio.findAll().forEach{println(it) }

    println("_________")
    repositorio.remove(mari.nome)
    repositorio.findAll().forEach{println(it)}
}