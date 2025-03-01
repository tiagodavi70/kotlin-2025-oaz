class Animal(val nome: String, val especie: String, val ano: Int) {
    val idade: Int
        get() {
            return 2025 - this.ano
        }
        // get() = 2025 - this.ano
}