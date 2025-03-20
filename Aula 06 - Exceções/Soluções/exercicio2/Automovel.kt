package exercicio2

class TanqueVazioException : Exception("Tentou consumir mais do que tem no tanque.")

open class Automovel(
    val modelo: String,
    var litrosTanque: Double, // litros que ainda estão no tanque
    var litrosKm: Double // consumo de litros por km
) {
    // Dado uma distância em km, calcula os litros utilizados
    fun litrosUtilizados(km: Double): Double {
        val litros = km * this.litrosKm
        consumirTanque(litros)
        return litros
    }

    // Consome a gasolina do tanque
    open fun consumirTanque(litros: Double) {
        if (litrosTanque - litros < 0) throw TanqueVazioException()
        this.litrosTanque = litrosTanque - litros
    }

    override fun toString(): String {
        return "$modelo | $litrosTanque | $litrosKm"
    }
}