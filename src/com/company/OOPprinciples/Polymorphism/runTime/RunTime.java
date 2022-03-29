package com.company.OOPprinciples.Polymorphism.runTime;


public class RunTime {
    public static void main(String[] args) {

        Bike bike = new Splendor();
        bike.run();
        bike.print();
        Bike.print();

    }
}

class Bike {

    void run(){
        System.out.println("Bike is running");
    }

    static void print() {
        System.out.println("HACHO");
    }

}

class Splendor extends Bike {

    @Override
    void run() {
        System.out.println("Bike is running safety with 60 km/h");
    }

    static void print(){
        System.out.println("HACHOsssssss");
    }
}
