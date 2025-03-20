package exercicio2

import kotlin.random.Random

// Em um sistema de gestão de funcionários, temos Contratado, ReciboVerde e Estagiário.
// Cada um tem um cálculo de salário diferente, baseado no número de horas. Crie uma interface
// para os pagamentos, que leve em consideração o número de horas e o salário base de cada um.
// Crie a folha de pagamento de 4 setores com 10 funcionários cada um.

fun criarFuncionario(): Pagamento {

    when (Random.nextInt(1,4)) {
        1 -> return Contratado("aaa")
        2 -> return ReciboVerde("bbb")
        else -> return Estagiario("ccc")
    }
    return Contratado("aaa")
}

fun main() {

//    val setores = mutableListOf<MutableList<Pagamento>>()
    val setores = HashMap<String, MutableList<Pagamento>>()

    for (i in 1..4) {
        setores.put("Setor $i", mutableListOf<Pagamento>())
        for (j in 1..10) {
            setores["Setor $i"]!!.add(criarFuncionario())
        }
        setores["Setor $i"]!!.forEach { pag -> pag.realizarPagamento(40) }
    }

    for (entry in setores.entries) {
        println("Setor: ${entry.key.split("=")[0]}\nPagamento: ${entry.value.sumOf { pag -> pag.realizarPagamento(40) }}")
    }
}
