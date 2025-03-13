package animal

abstract class Animal(open val nome: String, open var peso: Double) {

    abstract fun fazerBarulho() : String

    override fun toString(): String  = "$nome | $peso"
}