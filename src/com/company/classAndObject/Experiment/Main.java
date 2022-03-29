package com.company.classAndObject.Experiment;

public class Main {
    public static void main(String[] args) {
        Person per = new Person();
        Person per2 = new Person();
        System.out.println(per.id);
        System.out.println(per2.id);



    }
}

class Person{
    static int quantity = 0;
    int id;
    Person (){
        id = quantity;
        quantity++;
    }
}
