package aula0909.ingresso

abstract class Vip : Ingresso() {
    open val valorAdicional = 50.00

    fun retornaValorTotal(): Double {
        return valor + valorAdicional
    }

    override fun imprimeValor() {
        println("O valor do ingresso é R$ ${retornaValorTotal()}")
    }
}