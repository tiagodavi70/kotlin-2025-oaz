package q23

fun main() {

    val p1 = Produto("Arroz", "Carolino", 6.0)
    val p2 = Produto("Feijão", "Camil", 4.0)
    val p3 = Produto("Massa", "Milanesa", 1.4)
    val p4 = Produto("Pão", "Bimbo", 2.5)
    val p5 = Produto("Azeitona", "Gama", 3.0)

    val produtos = listOf<Produto>(p1, p2, p3, p4, p5)

    while (true) {
        print("Entra com o nome: ")
        val nome = readln() // readLine()

        var indice: Int = -1
        for (i in 0..produtos.size-1) {
            if (nome == produtos[i].nome) {
                indice = i
            }
        }
        if (indice != -1) {
            println(produtos[indice])
        } else {
            println("Produto não encontrado")
        }
    }
}