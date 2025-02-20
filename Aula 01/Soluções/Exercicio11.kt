//  Escreva um programa que mostre todas as possibilidades
//  de que no lançamento de dois dados tenhamos o valor 7 como
//  resultado da soma dos valores de cada dado.

fun main() {
    for (dado1 in 1..6) {
        for (dado2 in 1..6) {
            if (dado1 + dado2 == 7)
                println("$dado1 $dado2 | ${dado1 + dado2}")
        }
    }
}