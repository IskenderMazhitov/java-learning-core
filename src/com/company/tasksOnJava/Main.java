package com.company.tasksOnJava;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner inner = new Scanner(System.in);
        int j = inner.nextInt();
        int k = inner.nextInt();
        int res = (j/k * j + k/j * k)/(j/k + k/j);
        System.out.println(res);
    }
}