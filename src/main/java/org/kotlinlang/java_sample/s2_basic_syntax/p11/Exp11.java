package org.kotlinlang.java_sample.s2_basic_syntax.p11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exp11 {

    public static void main(String[] args) {
        final int x = Integer.parseInt(args[0]);

        final List<Integer> yRange = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        if (yRange.contains(x)) {
            System.out.println("OK");
        }

        final List<Integer> aRange = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer a : aRange) {
            System.out.println(a);
        }

        System.out.println();
        final List<String> array = new ArrayList<>();
        array.add("aaa");
        array.add("bbb");
        array.add("ccc");

        final List<Integer> bRange = new ArrayList<>();
        for (int i = 0; i < array.size() - 1; i++) {
            bRange.add(i);
        }

        if (!bRange.contains(x)) {
            String template = "Out: array has only %d elements. x = %d";
            System.out.println(String.format(template, array.size(), x));
        }

        if (array.contains("aaa")) {
            System.out.println("Yes: array contains aaa");
        }

        if (array.contains("ddd")) {
            System.out.println("Yes: array contains ddd");
        } else {
            System.out.println("No: array doesn't contains ddd");
        }
    }
}
