package com.example.api_collections

fun main(){

    val joao = funcionario("Joao", 1000.00)
    val pedro = funcionario("Pedro", 2500.00)
    val mari = funcionario("Mari", 5000.00)

    val Funcionarios = listOf(joao, pedro, mari)

    Funcionarios.forEach{println(it)}

    println("____")
    println(Funcionarios.find{it.nome =="Mari"})

}

data class funcionario(
    val nome:String,
    val salario: Double
){
    override fun toString(): String =
        """  
    Nome: $nome
    Salario: $salario
    """.trimIndent()

}
