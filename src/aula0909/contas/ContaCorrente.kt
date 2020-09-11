package aula0909.contas

class ContaCorrente(cliente: Cliente, saldo: Double, var limiteChequeEspecial: Double) : Conta(cliente, saldo) {

    fun depositarCheque(valor: Double, bancoEmissor: String, dataPagamento: String){
        saldo += valor
        println("Depositado o cheque do banco $bancoEmissor na data $dataPagamento")
    }

    override fun sacar(valor: Double) {
        if (saldo + limiteChequeEspecial >= valor) {
            println("Saque realizado")
            saldo -= valor
        }
        else {
            println("Saldo insuficiente")
        }
    }
}