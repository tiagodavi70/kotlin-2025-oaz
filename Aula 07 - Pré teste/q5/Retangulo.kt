package q5

class Retangulo(val largura: Double, val comprimento: Double): CalcularTamanho {

    override fun calcularArea(): Double {
        return largura * comprimento
    }

    override fun calcularPerimetro() = 2*largura + 2*comprimento
}