package artesgc.scripts.kotlin

import java.util.Arrays.binarySearch


fun main() {
    val lista1 = intArrayOf(1, 2, 3, 4, 5)
    val lista2 = intArrayOf(6, 7, 8, 9, 0)
    val lista3 = intArrayOf(1, 2, 3, 4, 5)

    // ************************************
    val res1 = lista1.contentEquals(lista2)
    val res2 = lista2.contentEquals(lista3)
    val res3 = lista3.contentEquals(lista1)

    println("lista1 == lista2 -> $res1")
    println("lista2 == lista3 -> $res2")
    println("lista1 == lista3 -> $res3")

    // ************************************
    println("lista1 = string -> ${lista1.contentToString()}")

    // ************************************
    val foundIndex: Int = binarySearch(lista1, 3)  // binarySearch(lista1, 78)
    println("3 in lista1 -> $foundIndex")
}
