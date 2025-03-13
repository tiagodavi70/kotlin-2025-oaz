package exercicio3

import kotlin.random.Random

fun main() {

    val casas = mutableListOf<Casa>()
    for (i in 1..10) {
        val sala = Comodo("Sala", Random.nextDouble(2.0, 3.0), Random.nextDouble(2.0, 3.0))
        val casaBanho = Comodo("Casa de banho", Random.nextDouble(2.0, 3.0), Random.nextDouble(2.0, 3.0), "Azul")
        val quarto1 = Comodo("Quarto", Random.nextDouble(2.0, 3.0), Random.nextDouble(2.0, 3.0))
        val quarto2 = Comodo("Quarto", Random.nextDouble(2.0, 3.0), Random.nextDouble(2.0, 3.0))

        casas.add(Casa("Tiago", mutableListOf<Comodo>(sala, casaBanho, quarto1, quarto2), "aaaa"))
    }
    println(casas.joinToString("\n\n"))
}