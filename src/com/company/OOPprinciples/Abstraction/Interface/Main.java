// INTERFACE


package com.company.OOPprinciples.Abstraction.Interface;


public class Main {
    /*
    - It is used to achieve abstraction.
    - By interface, we can support the functionality of multiple inheritance
    - It can be used to achieve loose coupling
     */
    public static void main(String[] args) {
        System.out.println(I.cube(4)); // invoke interface static method

    }
}

interface I {
    void i(); // in compiler, it'll look like: public abstract void i();
    static int cube(int x){
        return (int) Math.pow(x, 3);
    }

}
interface J extends I{
    void d();
}

class A implements J{
    public void i(){
        System.out.println("i");
    };
    public void d(){
        System.out.println("d");
    }
}

class B implements I {
    public void i(){
        System.out.println("hello");
    }
}