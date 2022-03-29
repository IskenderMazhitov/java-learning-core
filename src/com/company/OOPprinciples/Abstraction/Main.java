package com.company.OOPprinciples.Abstraction;

public class Main {
    /*
    - Abstract Class cannot be instantiated (created)
    - It can have constructor and static methods also
    - It can have final methods which will force the subclass not to change the body of the method.
    - It can have abstract and non-abstract methods
    - It cannot be instantiated
     */

    /*
    RULES:
    - IF IT HAS ABSTRACT METHOD, CLASS SHOULD BE ABSTRACT

     */
    public static void main(String[] args) {
        I i = new A();
        i.a();
        i.b();
        i.c();
        i.d();

    }
}

interface I {

    void a();
    void b();
    void c();
    void d();

}

abstract class Abs implements I{
    abstract void e();
    public void a(){
        System.out.println("Hello, I'm A");
    }
    public void d(){
        System.out.println("Hello, I'm D");
    };

}

class A extends Abs{
    public void b(){
        System.out.println("Hello, I'm B");
    }
    public void c(){
        System.out.println("Hello, I'm C");
    }
    void e(){
        System.out.println("Hello, I'm E");
    }
}