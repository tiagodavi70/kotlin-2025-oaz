package exercicio1

abstract class Pagamento {

    abstract val taxa: Double
    abstract val valorFinal: Double

    abstract open fun realizarPagamento(valor: Double) : Double
    open fun aplicarTaxa(valor: Double): Double = valor + taxa*valor
}