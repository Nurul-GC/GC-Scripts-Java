package artesgc.scripts.kotlin

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("\nDigite a sua idade:\n> ")
    val idade = input.nextInt()

    if (idade < 0 || idade > 100) {
        println("\nIdade inaceitavel!\nA idade deve estar entre os 0 e 100 anos...")
    } else if (idade < 18) {
        println("\nLamento voce ainda e menor...")
    } else if (idade < 21) {
        println("\nVoce precisa de autorizacao de seus pais...")
    } else {
        println("\nParabens!\nVoce esta habilitado a usar este programa...")
    }
}
