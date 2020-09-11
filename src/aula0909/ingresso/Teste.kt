package aula0909.ingresso

fun main(){
    var ingresso : Ingresso? = null
    println("Digite 1 para ingresso NORMAL e 2 para ingresso VIP")
    val entrada = readLine()
    when (entrada) {
        "1" -> {
            println("O ingresso é NORMAL")
            ingresso = Normal()
        }
        "2" -> {
            println("O ingresso é VIP")
            println("Digite 1 para Camarote SUPERIOR e 2 para Camarote INFERIOR")
            val entrada2 = readLine()
            when (entrada2) {
                "1" -> {
                    println("O ingresso é para Camarote SUPERIOR")
                    ingresso = CamaroteSuperior()
                }
                "2"-> {
                    println("O ingresso é para Camarote INFERIOR")
                    ingresso = CamaroteInferior()
                }
                else -> println("Opção inválida")
            }
        }
        else -> println("Opção inválida")
    }
    ingresso?.imprimeValor()
}