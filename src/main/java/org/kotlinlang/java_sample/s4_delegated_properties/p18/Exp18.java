package org.kotlinlang.java_sample.s4_delegated_properties.p18;

public class Exp18 {
    public static void main(String[] args) {
        final LazySample sample = new LazySample();

        System.out.println("lazyValue = " + sample.getLazyValue());
        System.out.println("lazyValue = " + sample.getLazyValue());
    }
}
