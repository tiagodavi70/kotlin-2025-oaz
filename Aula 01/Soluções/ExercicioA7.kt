//Escreva um programa quer faça o controle de estoque de uma loja. Em um menu deve ter as opções:
//cadastrar produto
//editar produto
//vender produto
//gerar relatório
//
//Na opção de cadastro o utilizador deve entrar com:
//nome do produto
//preço
//tipo
//
//Para cada produto cadastrado deve ser gerado um código.
//Na opção de editar deve permitir atualização do nome do produto.
//Na opção vender produto deve registrar uma venda do produto.
//E na opção gerar relatório deve mostrar o valor total ganho e a média por produto.

fun main() {
    val nomes = MutableList<String>(0) { "" }
    val precos = MutableList<Double>(0) { 0.0 }
    val tipos = MutableList<String>(0) { "" }
    val codigos = MutableList<Int>(0) { 0 }
    val vendas = MutableList<Int>(0) { 0 }

    println("Bem vindo!")
    var opcao = 0
    while (opcao != 5) {
        print("Entra com uma opção:")
        println("1 - Cadastrar produto\n2- Editar produto\n3 - Vender produto" +
                "4 - Gerar relatório\n5- Sair")
        opcao = readln().toInt()
        when (opcao) {
            1 -> {
                print("Entra com o nome: ")
                nomes.add(readln())
                print("Entra com o preco")
                precos.add(readln().toDouble())
                print("Entra com o tipo: ")
                tipos.add(readln())
                codigos.add(codigos.size+1)
            }
        }
    }


}

fun mostrarProdutos(codigos: List<Int>, nomes: List<String>,
                    precos: List<Double>, tipos: List<String> ) {
    for (i in 0..codigos.size-1) {
        println("${codigos[i]} - ${nomes[i]} | ${precos[i]} | $tipos[i]")
    }
}