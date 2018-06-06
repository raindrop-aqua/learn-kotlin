package org.kotlinlang.java_sample.p05;

public class Greeter {

    final private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println(String.format("Hello, %s", this.name));
    }
}
