package q5

class Circulo(val raio: Double): CalcularTamanho {

    override fun calcularArea() = Math.PI * (raio*raio)
    override fun calcularPerimetro() = 2 * Math.PI * raio
}