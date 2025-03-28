package q6

class Sala(nome: String, tipoPiso: String, tamanho: Double, val numSofas: Int)
    : Compartimento(nome, tipoPiso, tamanho) {

    override fun toString(): String {
        return super.toString() + " $numSofas"
    }
}