package com.company.instanceInitializerBlock;

public class Main {
    public static void main(String[] args) {
        B b = new B();

    }
}

class A{
    A(){
        System.out.println("Hello, parent class constructor is invoked");
    }

    {
        System.out.println("GJ wp, parent initializer block invoked");
    }
}

class B extends A{
    B(){
        System.out.println("Hey yo. that's child constructor");
    }

    {
        System.out.println("child initializer block invoked");
    }
}
/*
how its works:
B class constructor invoked
___
A class constructor invoked as super() of B class
A class super() - Nothing
initializer block of A class - GJ wp, parent initializer block invoked
entrails of A constructor - Hello, parent class constructor is invoked
___
initializer block of B class - child initializer block invoked
entrails of B constructor - Hey yo. that's child constructor
 */
