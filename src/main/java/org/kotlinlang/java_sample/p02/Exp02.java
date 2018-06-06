package org.kotlinlang.kt_sample.p02;

public class Exp02 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a name as a command-line argument");
            return;
        }
        System.out.println(String.format("Hello, %s!", args[0]));
    }
}
