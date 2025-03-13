package automovel

class Bicicleta(override val marchas: Int) : Automovel, Bipedal {
    override fun movimentar(km: Double) {
        println("Movimentou $km")
    }

    override fun fazerCurva(angulo: Double) {
        println("Curva em angulo: $angulo")
    }

    override fun trocarMarcha(novaMarcha: Int) {
        println("Marcha trocada: $novaMarcha")
    }
}