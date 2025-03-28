package q1

class Mesa(val largura: Double, val material: String) {
    override fun toString() = "Largura: $largura | Material: $material"

    val objetos = mutableListOf<Any>()
    fun colocarObjeto(objeto: Any) {
        objetos.add(objeto)
    }
}