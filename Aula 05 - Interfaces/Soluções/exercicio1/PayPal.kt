package exercicio1

class PayPal(override val taxa: Double): Pagamento() {
    override var valorFinal: Double = 0.0
        get() = field

    override fun realizarPagamento(valor: Double): Double {
        valorFinal = aplicarTaxa(valor)
        // fosse diferente para cada classe
        return valorFinal
    }
}