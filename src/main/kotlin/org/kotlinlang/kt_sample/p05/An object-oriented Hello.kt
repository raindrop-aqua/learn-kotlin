package org.kotlinlang.kt_sample.p05

class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    val g = Greeter(args[0]).greet()
}

