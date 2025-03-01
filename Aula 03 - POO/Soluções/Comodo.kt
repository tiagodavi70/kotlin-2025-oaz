class Comodo(val tipo: String,
             val comprimento: Double,
             val largura: Double,
             val cor: String = "Branca") {
    val tamanho
        get() = this.comprimento * this.largura
}
