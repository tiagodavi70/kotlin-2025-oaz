/*
class Pessoa(val nome: String, var nif: String, val telemovel: String)
*/

class Pessoa {
    var nome: String
    val nif: String
    var telemovel: String = ""
        get() = field
        set(value) {
            println("Set telemovel: $field $value")
            field = value
        }
    val historico : MutableList<Double> = mutableListOf()
    var peso: Double = 0.0
        get() { return field }
        set(value) {
            this.historico.add(value)
            // mandar novo valor pra internet
            field = value
        }

    init {
        println("Olá init")
        this.historico.addAll(0, mutableListOf()) // lista da internet
        // pegar coisas da internet (listas, ficheiros, imagens)
    }

    constructor(nome: String, nif: String, telemovel: String) {
        this.nome = nome
        this.nif = nif
        this.telemovel = telemovel // this.setTelemovel(telemovel)
        println("Olá construtor")
    }

    constructor(nome: String, nif: String, telemovel: String, peso: Double) : this(nome, nif, telemovel) {
        this.peso = peso
    }

//    fun alterarTelemovel(telemovel: String) {
//        this.telemovel = telemovel
//    }
//
//    fun getTelemovel(): String {
//        return this.telemovel
//    }
//
//    fun getNome() : String {
//        return this.nome
//    }
//
//    fun setNome(valor: String) {
//        this.nome = valor
//    }
}