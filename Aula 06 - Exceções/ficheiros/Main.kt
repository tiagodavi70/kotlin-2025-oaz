package ficheiros

import java.io.File

fun main() {

    val mensagem: String = "Olá mundo"

    File("ola.txt").writeText(mensagem)
    File("ficheiros/ola2.txt").writeText(mensagem)

    val textoFicheiro = File("ficheiros/ola2.txt").readText()
    println(textoFicheiro)
    println(File(".").listFiles().toList())
    println(File(".").listFiles() { f -> f.isFile } .toList())
    
    File("ficheiros/ola2.txt").readText()

}