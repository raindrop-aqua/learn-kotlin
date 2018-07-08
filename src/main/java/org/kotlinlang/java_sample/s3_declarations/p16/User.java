package org.kotlinlang.java_sample.s3_declarations.p16;

public class User {
    private final String name;
    private final int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User copy() {
        return new User(this.name, this.id);
    }

    public User copy(String name) {
        return new User(name, this.id);
    }

    public User copy(int id) {
        return new User(this.name, id);
    }

    public User copy(String name, int id) {
        return new User(name, id);
    }

    public String toString() {
        String template = "User(name=%s, id=%d)";
        return String.format(template, name, id);
    }

    @Override
    public boolean equals(Object o) {
        User u = (User)o;

        if (!(this.name.equals(u.name))) {
            return false;
        }
        if (this.id != u.id) {
            return false;
        }
        return true;
    }
}
