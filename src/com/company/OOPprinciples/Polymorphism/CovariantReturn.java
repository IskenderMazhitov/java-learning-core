package com.company.OOPprinciples.Polymorphism;

import java.util.Scanner;

public class CovariantReturn {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.get().message();
        System.out.println(b.print("K"));

        ClassA a = new ClassA();
        System.out.println(a.print("Iskender"));




    }
}

class ClassB extends ClassA {
    ClassB get(){
        return this;
    }
    void message() {
        System.out.println("Hello, that's me");
    }
}
