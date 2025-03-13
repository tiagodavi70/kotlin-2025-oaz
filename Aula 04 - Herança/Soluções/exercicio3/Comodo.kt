package exercicio3

class Comodo(val tipo: String,
             val comprimento: Double,
             val largura: Double,
             val cor: String = "Branca") {
    val tamanho
        get() = this.comprimento * this.largura

    override fun toString(): String {
        return "$tipo | ${String.format("%,.2f", comprimento).replace(",", ".")} x ${String.format("%,.2f", largura).replace(",", ".")} = $tamanho | $cor"
    }
}