package com.company.whileLoop;

public class Main {
    public static void main(String[] args) {
        int count = 21;
        while (count<= 20) {
            System.out.println("count" + count);
            count++;
        }
        count = 21;
        do {
            System.out.println("count" + count);
            count++;

        }
        while(count<=20);
    }
}
