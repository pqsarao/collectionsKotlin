package com.example.api_collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("_____")
    println(salarios.somatoria())

    println("_____")
    println(salarios.media())
}