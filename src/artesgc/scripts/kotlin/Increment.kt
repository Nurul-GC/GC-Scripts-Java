package artesgc.scripts.kotlin

import kotlin.jvm.JvmStatic

object Increment {
    @JvmStatic
    fun main(args: Array<String>) {
        var n = 1
        println("n++ -> " + n++)
        println("++n -> " + ++n)
    }
}
