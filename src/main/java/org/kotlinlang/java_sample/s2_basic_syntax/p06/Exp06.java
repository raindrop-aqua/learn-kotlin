package org.kotlinlang.java_sample.s2_basic_syntax.p06;

public class Exp06 {
    public static void main(String[] args) {
        System.out.println(max(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
