package org.kotlinlang.java_sample.s4_delegated_properties.p21;

import java.util.Map;

public class User {
    private String name;
    private Integer age;

    public User(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            this.name = key;
            this.age = map.get(key);
            break;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
