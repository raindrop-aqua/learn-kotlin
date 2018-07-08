package org.kotlinlang.java_sample.s4_delegated_properties.p17;

public class Exp17 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Example e = new Example();
        System.out.println(e.getP());
        e.setP("NEW");
    }
}
