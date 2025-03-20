package exercicio2

class Contratado(nome: String): Pessoa(nome), Pagamento {

    val valorHora: Double = 5.7

    override fun realizarPagamento(horas: Int): Double {
        return horas * valorHora
    }
}