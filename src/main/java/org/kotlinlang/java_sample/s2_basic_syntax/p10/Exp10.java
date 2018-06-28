package org.kotlinlang.java_sample.s2_basic_syntax.p10;

public class Exp10 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println();

        // or
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
