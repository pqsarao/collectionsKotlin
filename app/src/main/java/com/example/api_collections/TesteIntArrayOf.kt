package com.example.api_collections

fun main(){
    val values = intArrayOf(2, 3, 4, 10, 7, 1)
    values.forEach{
        println(it)
    }

    println("-----------------------")
        values.sort()
    values.forEach {
        println(it)
    }

    }
