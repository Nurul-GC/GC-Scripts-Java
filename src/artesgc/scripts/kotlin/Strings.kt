package artesgc.scripts.kotlin

import kotlin.jvm.JvmStatic

object Strings {
    @JvmStatic
    fun main(args: Array<String>) {
        val str = "Ola Mundo Java"
        println("string original -> $str")
        println("tamanho -> " + str.length)
        println("substring de [4, 9] -> " + str.substring(4, 9))
    }
}
