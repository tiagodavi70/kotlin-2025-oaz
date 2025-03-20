package exercicio2

import kotlin.random.Random

fun main() {
    val auto1 = Automovel("aaa", Random.nextDouble(100.0, 150.0), Random.nextDouble(0.2, 0.3))

    println(auto1.litrosTanque)
    try {
        auto1.litrosUtilizados(550.0)
    } catch (e: TanqueVazioException) {
        println(e.message)
    } finally {
        println(auto1.litrosTanque)
    }
}