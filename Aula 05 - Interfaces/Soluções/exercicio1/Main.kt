package exercicio1

import kotlin.random.Random

// Um sistema de pagamentos precisa suportar diferentes formas de pagamento, como cartão de crédito,
// Débito, MBWay e PayPal. Crie uma classe abstrata para processar os pagamentos, com duas funções
// - Realizar pagamento e aplicarTaxa e um atributo - taxa e salve o valor final em um atributo -
// valorFinal. Realize 500 pagamentos e apresente a média do valor gasto em cada um dos tipos
// de pagamento.


fun main() {
    val pagamentos = mutableListOf<Pagamento>()

    for (i in 1..500) {
        when (Random.nextInt(1,100)){
            in 1..25 -> pagamentos.add(Credito(Random.nextDouble(0.01, 0.02)))
            in 25..50 -> pagamentos.add(Debito(Random.nextDouble(0.005, 0.01)))
            in 50..75 -> pagamentos.add(MBWay(0.0))
            else -> pagamentos.add(PayPal(Random.nextDouble(0.01, 0.02)))
        }
    }
    pagamentos.forEach { pagamento ->
        pagamento.realizarPagamento(Random.nextDouble(10.0,500.0))
    }
//    for (i in 0..pagamentos.size-1) {
//        pagamentos[i].realizarPagamento(Random.nextDouble(10.0,500.0))
//    }
//    for (pagamento in pagamentos) {
//        pagamento.realizarPagamento(Random.nextDouble(10.0,500.0))
//    }
    println("Vendas Totais: ")
    var totalCredito: Double = 0.0
    for (pagamento in pagamentos)
        if (pagamento is Credito)
            totalCredito += pagamento.valorFinal
    println("Credito: ${totalCredito}")
    var totalDebito: Double = 0.0
    for (pagamento in pagamentos)
        if (pagamento is Debito)
            totalDebito += pagamento.valorFinal
    println("Debito: ${totalDebito}")
    var totalmb: Double = 0.0
    for (pagamento in pagamentos)
        if (pagamento is MBWay)
            totalmb += pagamento.valorFinal
    println("MBWay: ${totalmb}")
    var totalpp: Double = 0.0
    for (pagamento in pagamentos)
        if (pagamento is PayPal)
            totalpp += pagamento.valorFinal
    println("MBWay: ${totalpp}")

    println("Credito: ${pagamentos.filter{p -> p is Credito}
        .sumOf { pg -> pg.valorFinal }}")

}