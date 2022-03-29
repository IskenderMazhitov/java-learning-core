package com.company.methods.overloadingMethod;

public class Main {
    public static void main(String[] args) {
        display(4);
        display("Iska  ");

    }
    private static void display(int a){
        System.out.println("This data type is " + a + " related to integer");

    }
    private static void display(String a){
        System.out.println("This data type is " + a + " related to String");

    }
}
