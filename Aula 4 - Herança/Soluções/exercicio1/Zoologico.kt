package exercicio1
import kotlin.random.Random

class Zoologico {
    val animais: MutableList<Felino>

    private fun randomName(): String {
        val nome = Array<Char>(5) { "abcdefghijklmnopqrstuvwxyz".get(Random.nextInt(0,26))}
        var nomeStr = ""
        nome.forEach { c -> nomeStr += c }
        return nomeStr
    }

    constructor() {
        this.animais = mutableListOf<Felino>()
        for (i in 0..40-1) {
            when (Random.nextInt(0, 10)) {
                in 0..3 -> {
                    this.animais.add(Tigre(randomName(), Random.nextDouble(90.0, 310.0)))
                }
                in 3..7 -> {
                    this.animais.add(Leao(randomName(), Random.nextDouble(140.0, 275.0)))
                }
                else -> {
                    this.animais.add(Gato(randomName(), Random.nextDouble(1.5, 5.0)))
                }
            }
        }
    }
}

fun main() {
    val zoo = Zoologico()
    println(9.0.toString())

    println(zoo.animais.joinToString("\n"))
}