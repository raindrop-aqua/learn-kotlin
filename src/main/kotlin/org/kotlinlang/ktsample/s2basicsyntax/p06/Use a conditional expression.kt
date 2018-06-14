package org.kotlinlang.ktsample.s2basicsyntax.p06

fun main(args: Array<String>) {
    println(max(args[0].toInt(), args[1].toInt()))
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

