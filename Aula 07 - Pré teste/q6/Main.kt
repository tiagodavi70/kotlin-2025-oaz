package q6

// Escreva uma classe abstrata chamada Compartimento. Um Compartimento deve
//conter:
// Um nome
// Um tipo de piso
// Um tamanho em M2
//
// Escreva as classes Quarto, Cozinha e Sala, subclasses de Compartimento
// Quarto contém um campo que indica o tipo de cama (String)
// Cozinha contém um campo que indica quantidade de geladeiras (Int)
// Sala contém um campo que indica quantos sofás tem na sala (Int)
//Crie um programa com uma lista com 8 desses compartimentos, e crie uma função que
//dado uma lista de compartimentos retorne o compartimento com o maior tamanho dessa
//lista.

fun main() {

    val c1 = Quarto("aaa", "bbb", 2.0*2.5, "Solteiro")
    val c2 = Quarto("aaa", "bbb", 2.2*2.2, "Casado")
    val c3 = Quarto("aaa", "bbb", 2.1*2.3, "Solteiro")
    val c4 = Cozinha("aaa", "bbb", 2.0*2.9, 2)
    val c5 = Cozinha("aaa", "bbb", 1.5*2.3, 1)
    val c6 = Cozinha("aaa", "bbb", 2.1*1.9, 2)
    val c7 = Sala("aaa", "bbb", 3.1*1.9, 1)
    val c8 = Sala("aaa", "bbb", 2.1*2.1, 2)

    val compartimentos = listOf<Compartimento>(c1, c2, c3, c4, c5, c6, c7, c8)

    println(maiorCompartimento(compartimentos))
}

fun maiorCompartimento(comps: List<Compartimento>): Compartimento {

    // return comps.maxBy { c -> c.tamanho }
    var maior: Compartimento = comps[0]
    for (c in comps) {
        if (c.tamanho > maior.tamanho) {
            maior = c
        }
    }
    return maior
}