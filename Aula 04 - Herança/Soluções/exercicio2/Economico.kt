package exercicio2

class Economico(modelo: String, litrosTanque: Double, litrosKm: Double)
    : Automovel(modelo, litrosTanque, litrosKm) {

    override fun consumirTanque(litros: Double) {
        super.consumirTanque(litros * (1 - 0.03))
    }

    override fun toString(): String {
        return super.toString() + " | economico"
    }
}