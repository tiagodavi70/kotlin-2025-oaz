fun main(){

    val arraySimples = arrayOf(1, 2 ,3)
    arraySimples[0] // Os índices começam em 0
    println(arraySimples[1])

    var arrayMutavel = arrayOf(4, 5, 6)
    arrayMutavel[1] = 10
    println(arrayMutavel[1])
    println(arrayMutavel)

    var arrayGenerico = arrayOf(1, 1.6, "Ola", 'a')
    println(arrayGenerico[3])

    var arrayInteiro = intArrayOf(1, 2, 3)
    var arrayDouble = doubleArrayOf(0.0, 0.0)

    var arrayInteiroPreenchido = Array<Int>(10) { 0 }
    for (i in arrayInteiroPreenchido) {
        print("$i ")
    }
    println()
    for (i in 0 ..< arrayInteiroPreenchido.size) {
        print("${arrayInteiroPreenchido[i]} ")
    }
    println()

    val listaSimples = listOf(1, 2, 3)
    val listaInteira = List<Int>(10) { 0 }

    var listaMutavel = mutableListOf(4, 5, 6)
    listaMutavel[2] = 10
    println(listaMutavel)

    listaMutavel.add(0, 9)
    println(listaMutavel)
    listaMutavel.add(15)
    listaMutavel.removeFirst()
    println(listaMutavel)

}