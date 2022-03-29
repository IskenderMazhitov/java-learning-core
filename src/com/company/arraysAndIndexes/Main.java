package com.company.arraysAndIndexes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3,2,1,1,1,13,4};
        int four = numbers[numbers.length - 1];
        System.out.println(four);
        System.out.println(numbers.getClass().getSimpleName());
        String name = "Iskender";
        String firstname = name;
        firstname = firstname + "is Javist";
        System.out.println(firstname + name);

    }
}
