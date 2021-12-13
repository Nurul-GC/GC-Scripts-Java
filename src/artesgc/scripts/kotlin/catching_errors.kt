package artesgc.scripts.kotlin

import java.util.Scanner

fun main() {
    val num: Int
    val denom: Int
    val input = Scanner(System.`in`)

    try {
        print("Digite o numerador:\n> ")
        num = input.nextInt()

        print("Digite o denominador:\n> ")
        denom = input.nextInt()

        println("A divisao entre $num e $denom = ${num / denom}")
    } catch (erro: Exception) {
        println(erro.message)
    } finally {
        println("---- FINAL DO TESTE ----")
    }
}

