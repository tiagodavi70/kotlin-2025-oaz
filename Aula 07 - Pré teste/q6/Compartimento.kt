package q6

abstract class Compartimento(val nome: String, val tipoPiso: String, val tamanho: Double) {

    override fun toString(): String {
        return "$nome $tipoPiso $tamanho"
    }
}