package org.kotlinlang.java_sample.s2_basic_syntax.p12;

public class Exp12 {
    public static void main(String[] args) {
        cases("Hello");
        cases(1);
        cases(0L);
        cases(new MyClass());
        cases("hello");
    }

    private static void cases(Object obj) {
        if (new Integer(1).equals(obj)) {
            System.out.println("One");
        } else if ("Hello".equals(obj)) {
            System.out.println("Greeting");
        } else if (obj instanceof Long) {
            System.out.println("Long");
        } else if (!(obj instanceof String)) {
            System.out.println("Not a string");
        } else {
            System.out.println("Unknown");
        }
    }
}
