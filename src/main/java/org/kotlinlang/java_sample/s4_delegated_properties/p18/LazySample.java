package org.kotlinlang.java_sample.s4_delegated_properties.p18;

public class LazySample {
    private String lazyValue;

    public synchronized String getLazyValue() {
        if (lazyValue == null) {
            System.out.println("computed!");
            lazyValue = "my lazyValue";
        }
        return lazyValue;
    }
}
