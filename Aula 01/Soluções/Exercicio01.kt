// Escreva um programa que receba o valor de um produto, e para cada 100,00€
// dê um desconto de 0,05%.

fun main(){
    print("Bem vindo. Entra com o valor do produto: ")
    val valorProduto: Double = readln().toDouble() // readLine()!!.toDouble()
    val numeroDeAplicacoes: Int = (valorProduto / 100).toInt()
    val desconto: Double = 0.05 / 100

    val valorTotal:Double = valorProduto - (numeroDeAplicacoes * desconto * valorProduto)
    println("O valor do produto com desconto é: $valorTotal")
}