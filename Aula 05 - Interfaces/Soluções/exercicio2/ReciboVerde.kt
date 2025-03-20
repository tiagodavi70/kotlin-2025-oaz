package exercicio2

class ReciboVerde(nome: String): Pessoa(nome), Pagamento {

    val valorHora = 6.4

    override fun realizarPagamento(horas: Int): Double = valorHora * horas
}