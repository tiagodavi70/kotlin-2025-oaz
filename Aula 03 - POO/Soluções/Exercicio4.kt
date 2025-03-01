import java.util.Objects

fun main() {
    val produtos = mutableListOf<Produto>()
    val vendas = mutableListOf<Produto>()

    println("Bem vindo!")
    var opcao: Int = 1

    while (opcao != 5) {
        println("Entra com uma opção: ")
        println("1 - Cadastrar produto\n2 - Editar nome\n3 - Vender produto\n4 - Gerar relatório\n5 - sair")
        opcao = readLine()!!.toInt() // readln().toInt()
        when (opcao) {
            1 -> {
                print("Entra com um nome: ")
                val nome = readln() // readLine()
                print("Entra com o preço: ")
                val preco = readln().toDouble()
                print("Entra com o tipo: ")
                val tipo = readln()
                produtos.add(Produto(nome, preco, tipo, (produtos.size+1).toString()))
            }
            2 -> {
                println("Produtos: ")
                produtos.forEach { prod -> println(prod.exibir()) }
                print("Entra com o codigo para mudar o nome: ")
                val codigo = readln()
                val produtoEncontrado = produtos.find { prod -> prod.codigo == codigo}
                if (produtoEncontrado != null) {
                    println("Entra com o novo nome: ")
                    val nomeNovo = readln()
                    produtoEncontrado.nome = nomeNovo
                } else {
                    println("Produto não encontrado")
                }
            }
            3 -> {
                println("Produtos: ")
                produtos.forEach { prod -> println(prod.exibir()) }
                print("Entra com o codigo para realizar a venda: ")
                val codigo = readln()
                val produtoEncontrado = produtos.find { prod -> prod.codigo == codigo}
                if (produtoEncontrado != null) {
                    vendas.add(produtoEncontrado)
                } else {
                    println("Produto não encontrado")
                }
            }
            4 -> {
                var total: Double = 0.0
                vendas.forEach { produto -> total += produto.preco }
//                for (venda in vendas) {
//                    total += venda.preco
//                }
                println("Total de vendas: ")
                val parcial = produtos.forEach { produto -> (vendas.filter { venda-> venda == produto })
                    .sumOf { p -> p.preco } }

                for (produto in produtos) {
                    var parcial: Double = 0.0
                    for (venda in vendas) {
                        if (produto == venda) {
                            parcial += venda.preco
                        }
                    }
                    println("${produto.exibir()} : $parcial")
                }
            }
        }
    }
}