package artesgc.scripts.kotlin

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Digite um numero:\n> ")
    val n1 = input.nextInt()

    print("Digite outro numero:\n> ")
    val n2 = input.nextInt()

    val maior = if (n1 > n2) n1 else n2 // Math.max(1, 2)
    val menor = if (n1 < n2) n1 else n2 // Math.min(1, 2)
    println("\nO maior valor e -> $maior\nO menor valor e -> $menor")
}

