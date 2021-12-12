package artesgc.scripts.kotlin

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Digite um numero inteiro:\n> ")
    val n1 = reader.nextInt()

    print("Digite um numero decimal:\n> ")
    val n2 = reader.nextDouble()

    reader.nextLine()
    print("Digite qualquer coisa:\n> ")
    val str = reader.nextLine()

    // resultados
    System.out.printf("%nnumero inteiro = %d.%n", n1)
    System.out.printf("numero decimal = %.2f.%n", n2)
    System.out.printf("string = \"%s\".", str)
}
