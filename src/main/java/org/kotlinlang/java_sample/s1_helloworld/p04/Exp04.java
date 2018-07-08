package org.kotlinlang.java_sample.s1_helloworld.p04;

public class Exp04 {
    public static void main(String[] args) {
        String language = args.length == 0 ? "EN" : args[0];
        switch (language) {
            case "EN":
                System.out.println("Hello!");
                break;
            case "FR":
                System.out.println("Salut!");
                break;
            case "IT":
                System.out.println("Ciao!");
                break;
            default:
                String template = "Sorry, I can't greet you in %s yet!";
                System.out.println(String.format(template, language));
                break;
        }
    }
}
