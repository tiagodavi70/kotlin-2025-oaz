// Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade
// de 3% ao ano, e um país B com 7.000.000 de habitantes e uma taxa
// de natalidade de 2% ao ano, escreva um programa que calcule o
// tempo necessário para que a população do país A ultrapasse a população
// do país B.

fun main() {
    var popA: Int = 5000000
    var popB: Int = 7000000
    val taxaA: Double = 3/100.0
    val taxaB: Double = 2/100.0

    var anos = 0
    while (popA < popB) {
        popA = popA + (popA*taxaA).toInt()
        popB = popB + (popB*taxaB).toInt()
        anos++
        println("Ano $anos: $popA | $popB")
    }
    println("A população A ultrapassou a B em $anos anos")

}