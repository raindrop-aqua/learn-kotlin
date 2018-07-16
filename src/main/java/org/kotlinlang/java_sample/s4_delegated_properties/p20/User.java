package org.kotlinlang.java_sample.s4_delegated_properties.p20;

public class User {

    private String name;

    public void init(String name) {
        if (name == null) {
            throw new IllegalStateException();
        }
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new IllegalStateException();
        }
        return name;
    }
}
