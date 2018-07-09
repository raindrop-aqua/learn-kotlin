package org.kotlinlang.java_sample.s4_delegated_properties.p19;

import java.lang.reflect.Field;

public class User {

    private String name = "no name";

    public void setName(String newValue) throws NoSuchFieldException {
        String oldValue = this.name;
        this.name = newValue;
        onChange(this.getClass().getDeclaredField("name"), oldValue, newValue);
    }

    private void onChange(Field prop, String oldValue, String newValue) {
        String template = "%s -> %s";
        System.out.println(String.format(template, oldValue, newValue));
    }
}
