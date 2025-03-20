package exercicio1

fun main() {

    while (true) {
        try {
            print("Entra com uma conta (a () b): ")
            val conta: String = readln().replace(",", ".")
            val num1 = conta.split(" ")[0].toDouble()
            val op = conta.split(" ")[1][0]
            val num2 = conta.split(" ")[2].toDouble()

            try {
                val result = when (op) {
                    '+' -> num1 + num2
                    '-' -> num1 - num2
                    in charArrayOf('*', 'x') -> num1 * num2
                    '/' -> {
                        require((num1 != 0.0) and (num2 != 0.0)) { "Não divida por zero." }
                        num1 / num2
                    }

                    else -> error("Operção Inválida")
                }
                println(result)
            } catch (e: Exception) {
                println(e.message)
            }
        } catch (e: NumberFormatException) {
            println("Verifique os espaços ou os números.")
        } catch (e: Exception) {
            println(e.message)
            e.printStackTrace()
        }
    }
}