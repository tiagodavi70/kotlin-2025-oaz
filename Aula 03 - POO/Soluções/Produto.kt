class Produto {

    var nome: String = ""
        get() = field
        set(value) {field = value}
    val preco: Double
    val tipo: String
    val codigo: String

    constructor(nome: String, preco: Double, tipo: String, codigo: String) {
        this.nome = nome
        this.preco = preco
        this.tipo = tipo
        this.codigo = codigo
    }

    fun exibir(): String {
        return "${this.codigo} | ${this.nome} | ${this.preco} | ${this.tipo} "
    }
}