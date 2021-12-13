package artesgc.scripts.kotlin

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("\nDigite a sua nota final:\n> ")
    when (input.nextLine().uppercase(Locale.getDefault())) {
        "A" -> println("\nParabens...")
        "B" -> println("\nBoa, mais concentracao na proxima...")
        else -> println("\nUps, voce precisa estudar mais...")
    }
}
