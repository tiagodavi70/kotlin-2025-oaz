// Escreva um programa que crie um vetor com 20 valores
// inteiros aleatórios (entre 0 e 999).

import kotlin.random.Random

fun main() {

//    Random.nextInt(0,10)
//    Random.nextDouble() // número aleatório entre 0 1

    val vetorAleatorio = Array<Int>(20) { Random.nextInt(0, 999)}
    println(vetorAleatorio.toList())

    val vetorAleatorio2 = Array<Int>(20) { 0 }
    for (i in 0..vetorAleatorio2.size - 1) {
        vetorAleatorio2[i] = Random.nextInt(0, 999)
    }
    println(vetorAleatorio2.toList())
}