package com.company.arraysStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] myFamily = {"Iskender", "Kalyibek", "Venera", "Aktan", "Nazar"};
        String[] myFamily2 = new String[5];
        Arrays.stream(myFamily).forEach(System.out::println);
        Stream.of(myFamily).forEach(System.out::println);
        Arrays.asList(myFamily).forEach(System.out::println);
        System.arraycopy(myFamily, 0, myFamily2, 0, 5);
        Arrays.sort(myFamily2);
        System.out.println(Arrays.toString(myFamily2));
    }
}
