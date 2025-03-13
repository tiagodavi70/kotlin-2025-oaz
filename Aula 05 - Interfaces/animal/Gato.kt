package animal

class Gato(override val nome: String, override var peso: Double) : Animal(nome, peso) {

    override fun fazerBarulho(): String {
        return "Miau"
    }
}