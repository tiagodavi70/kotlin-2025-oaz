// Escreva um programa que receba dois números e mostre o
// somatório dos números entre eles.
// 4 8
// 4 + 5 + 6 + 7 + 8

fun main() {
    print("Entra com o numero 1: ")
    val num1: Int = readln().toInt() // readLine()!!.toInt()
    print("Entra com o numero 2: ")
    val num2: Int = readln().toInt() // readLine()!!.toInt()

    var soma: Int = 0
    for (i in num1..num2) {
        soma += i
    }
    println("Somatorio entre $num1 e $num2: $soma")

}