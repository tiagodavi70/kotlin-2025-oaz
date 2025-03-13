package animal

class Cachorro(nome: String, peso: Double) : Animal(nome, peso) {

    override fun fazerBarulho(): String {
        return "Au au"
    }

    override fun toString(): String {
        return super.toString() + " | Cachorro"
    }
}