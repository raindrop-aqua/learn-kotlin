package org.kotlinlang.ktsample.s2basicsyntax.p10

fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }

    println()

    // or
    for (i in args.indices) {
        println(args[i])
    }
}