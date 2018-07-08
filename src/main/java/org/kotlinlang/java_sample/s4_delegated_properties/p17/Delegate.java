package org.kotlinlang.java_sample.s4_delegated_properties.p17;

import java.lang.reflect.Field;

public class Delegate {

    static String getValue(Object thisRef, Field prop) {
        String template = "%s, thank you for delegating '%s' to me!";
        return String.format(template, thisRef, prop.getName());
    }

    static void setValue(Object thisRef, Field prop, String value) throws IllegalAccessException {
        // 値の代入
        prop.setAccessible(true);
        prop.set(thisRef, value);

        String template = "%s has been assigned to %s in %s";
        System.out.println(String.format(template, value, prop.getName(), thisRef));
    }
}
