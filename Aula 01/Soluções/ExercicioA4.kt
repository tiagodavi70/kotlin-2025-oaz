import kotlin.random.Random

// Escreva um programa que dado dois vetores indique os elementos
// que estão presentes nos dois vetores.

fun main() {

    val vetorA = Array<Int>(Random.nextInt(100,150)) {Random.nextInt(0,999)}
    val vetorB = Array<Int>(Random.nextInt(100,150)) {Random.nextInt(0,999)}

    for (i in 0..vetorA.size - 1) {
        for (j in 0..vetorB.size - 1) {
            if (vetorA[i] == vetorB[j]) {
                print("${vetorA[i]} ")
            }
        }
    }
    println()
    var lista = MutableList<Int>(0) {0}
    for (valorA in vetorA) {
        for (valorB in vetorB) {
            if (valorA == valorB) {
                if (!(valorA in lista)) {
                    lista.add(valorA)
                }
            }
        }
    }
    println(lista)
    println()

    println(vetorA.toList().intersect(vetorB.toList()))
}