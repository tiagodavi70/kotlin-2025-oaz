// Escreva um programa que receba 3 valores e imprima a média entre eles.

fun main() {
    print("Entra com o primeiro valor: ")
    val valor1: Double = readln().toDouble()
    print("Entra com o segundo valor: ")
    val valor2: Double = readln().toDouble()
    print("Entra com o terceiro valor: ")
    val valor3: Double = readln().toDouble()
    val media: Double = (valor1 + valor2 + valor3) / 3

    println("A média é: $media")
}