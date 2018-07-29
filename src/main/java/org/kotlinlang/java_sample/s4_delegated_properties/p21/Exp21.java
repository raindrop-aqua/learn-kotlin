package org.kotlinlang.java_sample.s4_delegated_properties.p21;

import java.util.HashMap;
import java.util.Map;

public class Exp21 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John Doe", 25);

        User user = new User(map);

        String template = "name = %s, age = %d";
        System.out.println(String.format(template, user.getName(), user.getAge()));
    }
}
