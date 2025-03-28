package q5

import kotlin.random.Random

// Crie uma interface CalcularTamanho com uma função calcularArea e uma
//calcularPerimetro. Crie duas classes, Retangulo e Circulo, que implementam essa
//interface. Crie 30 classes de cada tipo e calcule todas as áreas e perímetros. Valores das
//classes devem ser aleatórios.

fun main() {

    val tamanhos = mutableListOf<CalcularTamanho>()
    for (i in 1..30) {
        tamanhos.add(Retangulo(Random.nextDouble(6.0, 8.0), Random.nextDouble(6.0, 8.0)))
        tamanhos.add(Circulo(Random.nextDouble(6.0, 8.0)))
    }
    for (tam in tamanhos) {
        println("Area: ${tam.calcularArea()} | Perimetro: ${tam.calcularPerimetro()}")
    }
}