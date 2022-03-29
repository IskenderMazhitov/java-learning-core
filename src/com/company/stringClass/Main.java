package com.company.stringClass;

public class Main {
    public static void main(String[] args) {
        String name = "Hello";
        String greeting;
        greeting = name;
        name = "Bye";
        String codes = "hacho";
        String nameSecond = new String("Hello");
        System.out.println(name.toUpperCase().getClass().getCanonicalName() + '|' + greeting);
        System.out.println(name.contains("ye"));
        System.out.println(name.equals(nameSecond));

    }
}
