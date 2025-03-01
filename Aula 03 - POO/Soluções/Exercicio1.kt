import java.time.LocalDateTime
import java.util.Date

fun main() {

    var animal1 = Animal("Rex","Cachorro", 6)
    var data: Date = Date()

    var homem1 = Homem("Tiago", 32, "Brasileiro")
    println(LocalDateTime.now())

    val sala = Comodo("Sala", 3.0, 2.0)
    val casaBanho = Comodo("Casa de banho", 1.5, 2.0, "Azul")
    val quarto1 = Comodo("Quarto", 2.5, 2.5)
    val quarto2 = Comodo("Quarto", 2.5, 2.5)

    println(quarto2.tamanho)


    val proprietario = Pessoa("Tiago", "8888", "8888")
    val comodos = mutableListOf<Comodo>(sala, casaBanho, quarto1, quarto2)
    val casa1 = Casa(proprietario, comodos, "TTTTTTTTT00")

    println(casa1)
}