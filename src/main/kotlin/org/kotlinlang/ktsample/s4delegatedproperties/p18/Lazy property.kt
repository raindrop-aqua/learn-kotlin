package org.kotlinlang.ktsample.s4delegatedproperties.p18

class LazySample {
    val lazyValue: String by lazy {
        println("computed!")
        "my lazyValue"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazyValue = ${sample.lazyValue}")
    println("lazyValue = ${sample.lazyValue}")
}
