package com.company.instanceOfOperator;

public class Main {
    public static void main(String[] args) {
//        B b = (B) new A("Iskender");
        B d = null;
        A a = new B("Iskender");
        System.out.println(d instanceof B);
        System.out.println(a instanceof B);

        //

        B.method(a);

        System.out.println(a instanceof B);




    }
}

class A {
    String name;
     A(String name){
         this.name = name;
     }

}

class B extends A {
    B(String name){
        super(name);
    }
    static void method(A param){
        B b = (B) param;
        System.out.println("Downcasting perfomed");
    }
}




