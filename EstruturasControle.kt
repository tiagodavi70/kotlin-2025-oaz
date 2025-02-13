fun main(){

    /*
    print("Entra com tua idade: ")
    val idade = readln().toInt()
    // val idade = readLine()!!.toInt()

    if (idade >= 18) {
        println("Pode votar!")
    } else {
        println("Não pode votar")
    }

    print("Entra com tua cidade de nascimento: ")
    //val cidade = readln()
    val cidade = readLine()

    if (cidade == "Belém") {
        println("Belenense")
    } else if (cidade == "Oliveira de Azeméis") {
        println("Oliveirense")
    } else if (cidade == "Porto") {
        println("Portuense")
    } else if (cidade == "Aveiro") {
        println("Aveirense")
    }

    when (cidade) {
        "Belém" -> println("Belenense")
        "Oliveira de Azeméis" -> println("Oliveirense")
        "Porto" -> println("Portuense")
        "Aveiro" -> println("Aveirense")
        else -> println("Não sei")
    } */

    for (i in 1..10){
        print("$i ")
    }
    println()

    for (i in 0..200 step 5) {
        print("$i ")
    }
    println()

    for (i in 100 downTo 1) {
        print("$i ")
    }
    println()

    val valorFixo: Int = 10
    // valorFixo = 15

    var valorVariavel: Int = 15
    valorVariavel = 20
    println("$valorFixo $valorVariavel")

    var j = 1
    while (j < 11) {
        print("$j ")
        j++ // j = j + 1, j += 1
    }
}