import java.time.LocalDateTime

class Carro(val marca: String, val modelo: String, val velocidadeMaxima: Double, val ano: Int) {

    val idade: Int
        get() = LocalDateTime.now().year - ano

    val velocidadeMilhas: Double
        get() = 0.62137 * this.velocidadeMaxima

    fun exibir(): String {
        return "${this.marca} | ${this.modelo} | ${this.velocidadeMaxima} km/h | Ano: ${ano}"
    }
}