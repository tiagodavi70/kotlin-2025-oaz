package q1

class Arvore(val especie: String, var altura: Double) {
    override fun toString(): String {
        return "Espécie: $especie | Altura: $altura"
    }

    fun crescer() {
        this.altura += 5
    }
}