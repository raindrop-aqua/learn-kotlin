package org.kotlinlang.java_sample.s3_declarations.p16;

public class Exp16 {
    public static void main(String[] args) {
        final User user = new User("Alex", 1);
        System.out.println(user);

        final User secondUser = new User("Alex", 1);
        final User thirdUser = new User("Max", 2);

        System.out.println("user.equals(secondUser)" + user.equals(secondUser));
        System.out.println("user.equals(thirdUser)" + user.equals(thirdUser));

        System.out.println(user.copy());
        System.out.println(user.copy("Max"));
        System.out.println(user.copy(2));
        System.out.println(user.copy("Max", 2));
    }
}

