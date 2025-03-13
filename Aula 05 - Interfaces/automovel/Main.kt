package automovel

fun main() {

    val ligeiro1 = Ligeiro("aaa", 180.0)
    ligeiro1.movimentar(90.0)

    val bicicleta1 = Bicicleta(5)
    bicicleta1.movimentar(15.0)

    val automoveis = mutableListOf<Automovel>()
    automoveis.add(ligeiro1)
    automoveis.add(bicicleta1)

    for (auto in automoveis)
        auto.movimentar(15.0)
}