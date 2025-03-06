open class Animal(val nome: String) {

    fun exibirNome() {
        println("${this.javaClass} $nome")
    }
}