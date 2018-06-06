package org.kotlinlang.ktsample.p03;

public class Exp03 {
    public static void main(String[] args) {
        for (String name : args) {
            System.out.println(String.format("Hello, %s!", name));
        }
    }
}
