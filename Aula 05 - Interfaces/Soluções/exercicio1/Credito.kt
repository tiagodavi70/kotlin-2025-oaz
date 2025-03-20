package exercicio1

class Credito(override val taxa: Double): Pagamento() {
    override var valorFinal: Double = 0.0
        get() = field

    override fun realizarPagamento(valor: Double): Double {
        valorFinal = aplicarTaxa(valor)
        return valorFinal
    }
}