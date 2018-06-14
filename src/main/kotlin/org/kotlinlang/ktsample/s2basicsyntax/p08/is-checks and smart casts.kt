package org.kotlinlang.ktsample.s2basicsyntax.p08

fun main(args: Array<String>) {
    println(getStringLength("aaa"))
    println(getStringLength(1))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}