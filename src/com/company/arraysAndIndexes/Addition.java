package com.company.arraysAndIndexes;

import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }
        for (int number: numbers) {
            System.out.println(number);
        }
        }
    }
