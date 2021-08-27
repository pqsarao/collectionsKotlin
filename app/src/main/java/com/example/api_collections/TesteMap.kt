package com.example.api_collections

fun main(){
    val pair: Pair<String, Double> = Pair ("Joao", 1000.00)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - valor: $v")}

    val map2 = mapOf("Pedro" to 2500.00,
                        "Maria" to 3200.00)
    map2.forEach { (k, v) -> println("Chave: $k - valor: $v")}
}