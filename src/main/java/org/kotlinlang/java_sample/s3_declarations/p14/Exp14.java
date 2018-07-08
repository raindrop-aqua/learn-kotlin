package org.kotlinlang.java_sample.s3_declarations.p14;

public class Exp14 {
    public static void main(String[] args) {
        final User user = User.getUser();

        String template = "name = %s, id = %d";
        System.out.println(String.format(template, user.getName(), user.getId()));

        // or

        final String name = user.getName();
        final int id = user.getId();
        System.out.println(String.format(template, name, id));

        // or

        System.out.println(String.format(template, user.getName(), user.getId()));
    }
}
