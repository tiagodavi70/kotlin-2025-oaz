// Escreva um programa que receba a idade de um nadador e mostre na tela a sua categoria seguindo as regras:
//Categoria	Idade
//Infantil A	5 - 7 anos
//Infantil B	8 - 10 anos
//Juvenil A	11 - 13 anos
//Juvenil B	14 - 17 anos
//Sênior	maiores de 18 anos

fun main() {
    print("Entra com a idade do nadador: ")
    val idade: Int = readln().toInt() // readLine()!!.toInt()

    if ( (idade >= 5) and (idade <= 7)) {
        println("Infantil A")
    } else if ( (idade >= 8) and (idade <= 10)) {
        println("Infantil B")
    } else if ( (idade >= 11) and (idade <= 13)) {
        println("Juvenil A")
    } else if ( (idade >= 14) and (idade <= 17)) {
        println("Juvenil B")
    } else if ( (idade >= 18) ) {
        println("Sênior")
    } else {
        println("Não pode nadar")
    }

    when {
        idade in 5..7 -> println("Infantil A")
        idade in 8..10 -> println("Infantil B")
        idade in 11..13 -> println("Juvenil A")
        idade in 14..17 -> println("Juvenil B")
        idade >= 18 -> println("Sênior")
        else -> println("Não pode nadar")
    }

}