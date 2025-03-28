package q1

class Casa(val numQuartos: Int, val endereco: String) {
    override fun toString(): String {
        return "Endereço: $endereco | Quartos: $numQuartos"
    }

    fun abrirPorta(): String {
        return "Porta aberta"
    }
}