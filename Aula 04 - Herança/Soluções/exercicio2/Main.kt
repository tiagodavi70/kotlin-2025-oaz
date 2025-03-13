package exercicio2

import kotlin.random.Random

fun randomName(): String {
    val nome = Array<Char>(5) { "abcdefghijklmnopqrstuvwxyz".get(Random.nextInt(0,26))}
    var nomeStr = ""
    nome.forEach { c -> nomeStr += c }
    return nomeStr
}

fun main() {

    val automoveis = Array<Automovel> (50) {

        if (Random.nextDouble() < 0.75) {
            Automovel(randomName(), Random.nextDouble(100.0, 150.0), Random.nextDouble(0.2, 0.3))
        } else {
            Economico(randomName(), Random.nextDouble(100.0, 150.0), Random.nextDouble(0.2, 0.3))
        }
    }

//    automoveis.forEach { carro -> carro.litrosUtilizados(150.0) }
    println(automoveis.joinToString("\n"))
    println()
    for (carro in automoveis) {
        carro.litrosUtilizados(150.0)
    }
    println(automoveis.joinToString("\n"))
}