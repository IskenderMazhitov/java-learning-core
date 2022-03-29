package com.company.arrays;

import java.util.Arrays;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int zero = 0;
        int one = 1;

        int[] numbers = new int[5];


        while (Math.abs(zero) < numbers.length){
            numbers[Math.abs(zero)] = 1;
            zero--;
        }
        System.out.println(Arrays.toString(numbers));
        int[] integers = {2,0,1};
        System.out.println(Arrays.toString(integers));
        String[] names = {"Ali", "Maria"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        String[] allowedNames = new String[2];
        System.arraycopy(names, 0, allowedNames, 0, 2);
        System.out.println(Arrays.toString(allowedNames));


    }
}
