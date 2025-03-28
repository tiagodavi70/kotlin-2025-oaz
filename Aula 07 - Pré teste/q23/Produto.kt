package q23

open class Produto(var nome: String, var marca: String, preco: Double) {
    open var preco: Double = if (preco >= 0) preco else throw Exception("Valor menor que 0.")
        set(value) {
            field = if (value >= 0) value else throw Exception("Valor menor que 0.")
        }
        get() = field
    open fun imposto(valor: Double): Double {
        return preco * valor
    }
    open fun aplicarImposto(valor: Double): Double {
        return preco + imposto(valor)
    }

    override fun toString() = "Nome: $nome | Marca: $marca | Preço: $preco"
}