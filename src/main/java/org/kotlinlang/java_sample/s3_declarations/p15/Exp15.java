package org.kotlinlang.java_sample.s3_declarations.p15;

import java.util.HashMap;
import java.util.Map;

public class Exp15 {
    public static void main(String[] args) {
        final Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            String template = "key = %s, value = %d";
            System.out.println(String.format(template, m.getKey(), m.getValue()));
        }
    }
}
