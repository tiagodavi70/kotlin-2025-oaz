import kotlin.random.Random

// Escreva uma função que dado um vetor calcule seu somatório e média.

fun main() {

    val vetor = Array<Double>(Random.nextInt(10,100)) {
        Random.nextDouble() * 100
    }

    println(somatorioMedia(vetor).toList())
}

fun somatorioMedia(vetor: Array<Double>): Array<Double> {

    var resultados = Array<Double>(2) {0.0}

    var soma: Double = 0.0
    for (d in resultados) {
        soma += d
    }
    var media:Double = soma / vetor.size

    resultados[0] = vetor.sum()
    resultados[1] = vetor.average()

    return resultados
}
