package artesgc.scripts.kotlin

fun main() {
    // *****************************
    for (n in 0..4) {
        print(n)
    }
    println()

    // *****************************
    val numeros = intArrayOf(1, 2, 3, 4, 5)
    for (n in numeros) {
        print(n)
    }
    println()

    // *****************************
    var n = 5
    while (n > 0) {
        println("n = $n")
        n--
    }
    do {
        println("n = $n")
        n++
    } while (n < 5)
}
