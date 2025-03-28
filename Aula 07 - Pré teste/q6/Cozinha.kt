package q6

class Cozinha(nome: String, tipoPiso: String, tamanho: Double, val numGeladeiras: Int)
    : Compartimento(nome, tipoPiso, tamanho) {

    override fun toString(): String {
        return super.toString() + " $numGeladeiras"
    }
}