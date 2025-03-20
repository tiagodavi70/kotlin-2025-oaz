package excecoes

//class DivisaoPorZeroException : ArithmeticException("Erro de divisão por zero.")

fun main() {

    println(criarLista(10))
    println(criarLista(5))
    println(criarLista(3))
    println(criarLista(-1))

    while (true) {
        try {
            print("Entra com o número 1: ")
            val a = readln().toDouble()
            print("Entra com o número 2: ")
            val b = readLine()!!.toDouble()

            try {
                println(divisao(a, b))
            } catch(e: DivisaoPorZeroException) {
                println(e.message)
                when (e.argumento) {
                    1 -> println("Numero 1 é 0.")
                    2 -> println("Numero 2 é 0.")
                    3 -> println("Ambos os números são 0.")
                }
            } catch (e: ArithmeticException) {
                println(e.message)
            }
        } catch (e: NumberFormatException) {
            println("Preencha com um número")
        } catch(e: Exception) {
            println(e.message)
            e.printStackTrace()
        }
    }
}
class DivisaoPorZeroException(override val message: String?, val argumento: Int = 2)
    : ArithmeticException(message)

fun divisao(a1: Number, b1: Number): Double {
    val a = a1.toDouble()
    val b = b1.toDouble()

    // check((a != 0.0) and (b != 0.0)) { "Não divida por zero." }

    if ((a == 0.0) or (b == 0.0)) {
        var argumento: Int = 0
        if (a == 0.0) argumento += 1
        if (b == 0.0) argumento += 2

        throw DivisaoPorZeroException("Divisão por zero.", argumento)
    }

    return a /b
}

fun criarLista(tamanho: Int): List<Int> {
//    require(tamanho > 0) { "Tamanho inválido: $tamanho" }
//     check(tamanho < 0) { "Tamanho inválido: $tamanho" }
    if (tamanho < 0)
        error("Tamanho inválido: $tamanho")
    return List<Int>(tamanho) { 0 }
}