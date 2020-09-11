package aula0909.contas

abstract class Conta(cliente: Cliente, saldo: Double) {
    val cliente = cliente
    var saldo = saldo

    fun depositar(valor: Double) {
        println("Depósito realizado")
        saldo += valor
    }

    open fun consultarSaldo() {
        println("O seu saldo é de R$ $saldo")
    }

    abstract fun sacar(valor: Double)
}