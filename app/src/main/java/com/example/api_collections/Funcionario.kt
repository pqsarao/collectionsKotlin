package com.example.api_collections

data class funcionario(
        val nome:String,
        val salario: Double,
        val tipoContratacao: String
    ){
        override fun toString(): String =
            """  
    Nome: $nome
    Salario: $salario
    """.trimIndent()
    }

