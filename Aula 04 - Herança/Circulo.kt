import java.lang.Math

class Circulo(val raio: Double) : Forma() {

    override fun area(): Double {
        return Math.PI * raio * raio
    }
}