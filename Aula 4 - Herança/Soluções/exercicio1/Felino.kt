package exercicio1

open class Felino(val nome: String, var peso: Double) {

    open val domestico: Boolean
        get() = false

    override fun toString(): String = "$nome | $peso"
}