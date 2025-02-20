// Escreva um programa que receba a idade, a altura e o peso de 12 pessoas.
// Ao final apresente:
//
// a quantidade de pessoas com idade superior a 50 anos
// a média das alturas das pessoas com idade entre 10 e 20 anos
// a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.
fun main() {

    var quantidadeSuperior50: Int = 0
    var somaAlturas1020: Double = 0.0
    var quantidadeAlturas1020: Int = 0
    var quantidadePesoInferior40 = 0.0
    val total: Int = 12
    for (i in 1..total) {
        print("Entra com tua idade: ")
        val idade = readln().toInt()
        print("Entra com tua altura: ")
        val altura = readLine()!!.toDouble()
        print("Entra com teu peso: ")
        val peso = readln().toDouble()

        if (idade > 50) {
            quantidadeSuperior50++ // quantidadeSuperior50 += 1
        }
        if (idade in 10..20) {
            somaAlturas1020 += altura
            quantidadeAlturas1020++
        }

        if (peso < 40) {
            quantidadePesoInferior40++
        }
    }
    println("Idade superior a 50: $quantidadeSuperior50")

    println("Média de alturas com idades entre 10 e 20:" +
            "${somaAlturas1020/quantidadeAlturas1020}")

    println("Porcentagem de pesos menor que 40:" +
            " ${quantidadePesoInferior40/total}")
}