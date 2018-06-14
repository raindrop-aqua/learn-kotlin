package org.kotlinlang.java_sample.s2_basic_syntax.p07;

public class Exp07 {
    private static Integer parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("One of the arguments isn't Int");
        }
        return null;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("No number supplied");
        } else {
            final Integer x = parseInt(args[0]);
            final Integer y = parseInt(args[1]);

            if (x != null && y != null) {
                System.out.println(x * y);
            } else {
                System.out.println("One of the arguments is null");
            }
        }
    }
}
