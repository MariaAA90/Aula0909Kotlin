package aula0909.contas

class ContaPoupanca(cliente: Cliente, saldo: Double) : Conta(cliente, saldo) {
    val taxaJuros = 0.005

    override fun sacar(valor: Double) {
        if (saldo >= valor) {
            println("Saque realizado")
            saldo -= valor
        }
        else {
            println("Saldo insuficiente")
        }
    }

    fun recolherJuros() {
        saldo += saldo * taxaJuros
        println("Os juros foram recolhidos")
    }
}