package aula0909.ingresso

abstract class Ingresso {
    val valor = 100.00
    open fun imprimeValor() {
        println("O valor do ingresso é R$ $valor")
    }
}