package com.company.constructor;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println("Your object's name is " + obj.name);

    }
}
class Person {
    protected String name;
    Person(){
        System.out.println("This creating referees to " + this.getClass());
    }
}