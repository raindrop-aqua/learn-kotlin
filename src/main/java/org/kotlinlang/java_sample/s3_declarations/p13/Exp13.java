package org.kotlinlang.java_sample.s3_declarations.p13;

public class Exp13 {
    public static void main(String[] args) {
        final Pair<Integer, String> pair = new Pair<>(1, "one");
        final int num = pair.getFirst();
        final String name = pair.getSecond();

        String template = "num = %d, name = %s";
        System.out.println(String.format(template, num, name));
    }
}
