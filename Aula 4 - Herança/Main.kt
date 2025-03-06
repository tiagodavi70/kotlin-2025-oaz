import kotlin.random.Random

fun main() {

    val animal = Animal("animal animal")
    val gato = Gato("Nina")

    animal.exibirNome()
    gato.exibirNome()

    val formas = mutableListOf<Forma>()

    for (i in 0..10) {
        if (Random.nextDouble() > 0.5) {
            formas.add(Quadrado(Random.nextInt(5, 10).toDouble()))
        } else {
            formas.add(Circulo(Random.nextInt(5, 10).toDouble()))
        }
    }

    for (i in 0..formas.size - 1) {
        println("${formas[i].javaClass} ${formas[i].area()}")
    }
}