package q6

class Quarto(nome: String, tipoPiso: String, tamanho: Double, val tipoCama: String)
    : Compartimento(nome, tipoPiso, tamanho) {

    override fun toString(): String {
        return super.toString() + " $tipoCama"
    }
}