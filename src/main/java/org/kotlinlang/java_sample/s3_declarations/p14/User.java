package org.kotlinlang.java_sample.s3_declarations.p14;

public class User {
    private final String name;
    private final int id;

    private User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static User getUser() {
        return new User("Alex", 1);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
