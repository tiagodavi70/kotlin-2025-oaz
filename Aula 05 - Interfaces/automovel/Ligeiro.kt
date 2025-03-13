package automovel

class Ligeiro(val modelo: String, val velocidadeMaxima: Double) : Automovel {

    override fun fazerCurva(angulo: Double) {
        println("Cruva em angulo: $angulo")
    }

    override fun movimentar(km: Double) {
        println("Movimentou $km em ${(km/velocidadeMaxima)*60} minutos.")
    }
}