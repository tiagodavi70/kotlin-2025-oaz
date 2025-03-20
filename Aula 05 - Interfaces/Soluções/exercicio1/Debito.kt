package exercicio1

class Debito(override val taxa: Double): Pagamento() {

    override var valorFinal: Double = 0.0
        get() = field

    override fun realizarPagamento(valor: Double): Double {
        valorFinal = aplicarTaxa(valor)
        return valorFinal
    }
}