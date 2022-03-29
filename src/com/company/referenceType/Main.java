package com.company.referenceType;


import java.time.LocalDate;

public class Main {
    public static void main(String []args) {
        String name = new String("iskacode");
        int age = 20;
        char c = name.charAt(5);
        System.out.println(c);
        LocalDate now = LocalDate.now();
        String ff = new String(now.getMonth().getClass().getCanonicalName());
        System.out.println(now.getMonth().getClass().getCanonicalName());
        System.out.println("I love pizza");
        System.out.println(ff.getClass());
        Person alex = new Person("alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " | " + mariam.name);
        alex.name = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name +" | "+ mariam.name);

    }
    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

    }


}
