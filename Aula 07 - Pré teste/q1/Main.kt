package q1

// 1) Considere as entidades abaixo:
// Banco, Casa, Mesa, Árvore, Prato
// Crie uma classe para cada entidade, com 2 atributos e 1 metodo no mínimo. Sobrescreva
// o metodo toString para apresentar as informações sobre a classe. Crie um programa em
// Kotlin que crie 2 objetos para cada classe criada e apresente na tela todos eles

fun main() {
    println(Banco("Branco", 25.0))
    println(Banco("Verde", 19.0))
    println(Casa(2, "Oliveira de Azeméis"))
    println(Casa(1, "Oliveira de Azeméis"))
    println(Mesa(1.3, "Madeira"))
    println(Mesa(1.2, "Ferro"))
    println(Arvore("Eucalipto", 60.0))
    println(Arvore("Pinheiro", 30.0))
    println(Prato("Branco", "Porcelana"))
    println(Prato("Azul", "Porcelana"))
}