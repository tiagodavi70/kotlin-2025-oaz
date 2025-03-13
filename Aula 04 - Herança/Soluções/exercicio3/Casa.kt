package exercicio3

class Casa(var proprietario: String,
           val comodos: MutableList<Comodo>,
           val endereco: String) {

    override fun toString(): String {
        return "$proprietario | $endereco \n -- ${comodos.joinToString("\n -- ")}"
    }
}