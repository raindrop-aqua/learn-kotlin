package org.kotlinlang.java_sample.s2_basic_syntax.p08;

public class Exp08 {
    public static void main(String[] args) {
        System.out.println(getStringLength("aaa"));
        System.out.println(getStringLength(1));
    }

    private static Integer getStringLength(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        return null;
    }
}
