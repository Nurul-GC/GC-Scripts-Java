package artesgc.scripts.kotlin

fun main() {
    val value1 = 1 == 1 && 2 != 3
    val value2 = 2 != 2 || 3 == 4

    if (value1) {
        println("value1 = 1==1 && 2!=3 -> true")
    } else {
        println("value1 = 1==1 && 2!=3 -> false")
    }

    if (!value2) {
        println("value2 = 2!=2 || 3==4 -> false")
    } else {
        println("value2 = 2!=2 || 3==4 -> true")
    }

    if (value1 != value2) {
        println("value1 != value2 -> true")
    } else {
        println("value1 != value2 -> false")
    }
}
