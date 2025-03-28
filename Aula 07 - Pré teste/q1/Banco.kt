package q1

class Banco(val cor: String, val peso: Double) {
    override fun toString() = "Cor: $cor | Peso: $peso"

    fun isPesado(): Boolean {
        return peso > 20
    }
}