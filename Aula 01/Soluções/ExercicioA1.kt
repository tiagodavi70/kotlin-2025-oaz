// Escreva um programa que crie um vetor com 10 posições e
// receba seus valores do usuário. Ao final deverá mostrar
// somente os valores acima da média.

fun main() {

    var vetor = Array<Double>(10) { 0.0 }
    for (i in 0..vetor.size - 1) {
        print("Entra com o valor ${i + 1}: ")
        vetor[i] = readLine()!!.toDouble()
    }
    var soma: Double = 0.0
    for (valor in vetor) {
        soma += valor
    }
    val media: Double = soma/vetor.size
    for (valor in vetor) {
        if (valor > media) {
            println(valor)
        }
    }
}