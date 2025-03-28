package q1

import kotlin.random.Random

class Prato(val cor: String, val material: String) {
    override fun toString(): String {
        return "Cor: $cor | Material: $material"
    }

    fun servirComida(): Boolean {
        return Random.nextBoolean()
    }
}