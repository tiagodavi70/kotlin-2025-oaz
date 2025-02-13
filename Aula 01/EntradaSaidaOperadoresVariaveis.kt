
fun main() {
    println("Olá mundo!")
    println(9)

    val nome = "Tiago"
    println("Olá $nome")

    val numero = 20
    println(numero)
    println("numero + 10 = ${numero + 10}")

    val a = 10.0
    val b = 15
    println("Operações")
    println(a + b)
    println(a - b)
    println(a / b)
    println(a * b)

    val verdadeiro = true
    val falso = false
    println("Booleanos")
    println(verdadeiro and verdadeiro)
    println(verdadeiro and falso)
    println(falso and verdadeiro)
    println(falso and falso)
    println()
    println(verdadeiro or verdadeiro)
    println(verdadeiro or falso)
    println(falso or verdadeiro)
    println(falso or falso)
    println()
    println(!verdadeiro)
    println(!falso)

    println("Inequações")
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b.toDouble())
    println(a != b.toDouble())
    val c = 15.9
    println(c.toInt())

    print("Entra com teu nome: ")
    val novoNome = readln()
    //val novoNome = readLine()
    println("Olá $novoNome")

    print("Qual tua idade? ")
    // val idade = readln().toInt()
    val idade = readLine()!!.toInt()
    println("Tua idade é: $idade")

    // Int - Inteiro
    // Double - Flutuante de dupla precisão
    // String - Cadeira de caracteres
    // Boolean - Valor lógico
    // Float - Flutuante simples
    // Long - Inteiro longo
    // Char - Caracter único

    val variavelInteira: Int = 10
    val variavelDecimal: Double = 20.0
    val variavelString: String = "Qualquer"
    val variavelLogica: Boolean = true
    val variavelFLutuante: Float = 3.2f
    val variavelLong: Long = 6
    val variavelChar: Char = 'a'
}