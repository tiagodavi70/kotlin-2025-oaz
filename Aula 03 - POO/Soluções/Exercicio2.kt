
fun main() {

    val carro1 = Carro("aaa", "bbb", 150.0, 2021)
    val carro2 = Carro("ccc", "ddd", 160.0, 2020)
    val carro3 = Carro("eee", "fff", 170.0, 2022)
    val carro4 = Carro("ggg", "hhh", 180.0, 2024)

    val carros = listOf<Carro>(carro1, carro2, carro3, carro4)

    for (carro in carros) {
        println(carro.exibir())
    }
    println()
    carros.forEach { carro -> println(carro.exibir()) }

    carros.forEach { carro -> println("${carro.velocidadeMilhas}") }
}