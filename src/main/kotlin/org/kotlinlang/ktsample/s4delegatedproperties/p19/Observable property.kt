package org.kotlinlang.ktsample.s4delegatedproperties.p19

import org.kotlinlang.java_sample.s4_delegated_properties.p17.Delegate
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class User {
    var name: String by Delegates.observable("no name") {
        prop, old, new ->
            println("$old -> $new")
    }

    var age: Int by Delegates.vetoable(15) {
        prop, old, new ->
           0 <= new
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "first"
    user.name = "second"
    user.age = -1
    println(user.age)
}
