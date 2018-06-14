package org.kotlinlang.ktsample.s1helloworld.p05

class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}

