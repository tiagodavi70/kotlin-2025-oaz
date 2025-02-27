fun main() {

    val pessoa1 = Pessoa("Tiago", "0000", "0000")
    println("${pessoa1.nome} ${pessoa1.nif} ${pessoa1.telemovel}")
    val pessoa2 = Pessoa("Davi", "1111", "1111111")
    println("${pessoa2.nome} ${pessoa2.nif} ${pessoa2.telemovel}")

//    pessoa1.nif = "9999"
//    println("${pessoa1.nif}")

    pessoa1.telemovel = "9999"

    val pessoa3 = Pessoa("Manoel", "3333", "33333", 80.0)
    pessoa3.peso = 78.0
    pessoa3.peso = 77.0
    pessoa3.peso = 75.0
    println(pessoa3.peso)
    println(pessoa3.historico)
}