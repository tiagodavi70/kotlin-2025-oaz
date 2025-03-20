package exercicio2

class Estagiario(nome: String): Pessoa(nome), Pagamento {
    val valorHora = 3.5

    override fun realizarPagamento(horas: Int): Double = valorHora * horas
}