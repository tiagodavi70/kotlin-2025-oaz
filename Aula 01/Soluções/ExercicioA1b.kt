fun main() {

    var vetor = Array<Double>(10) { 0.0 }
    for (i in 0..vetor.size - 1) {
        print("Entra com o valor ${i + 1}: ")
        vetor[i] = readLine()!!.toDouble()
    }
    val soma = vetor.sum()
    val media = vetor.average()

    val valoresMaiores = vetor.filter { valor -> valor > media }
    println("$media $valoresMaiores")
}