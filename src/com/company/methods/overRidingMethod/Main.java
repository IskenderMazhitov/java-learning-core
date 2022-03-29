package com.company.methods.overRidingMethod;

public class Main {
    public static void main(String[] args) {
        Vehicle.statusOfMoving();
        Bike.statusOfMoving();
    }
}

class Vehicle{
    public static void statusOfMoving(){
        System.out.println("Vehicle is moving");
    }
}

class Bike extends Vehicle{
    public static void statusOfMoving(){
        System.out.println("Bike is moving");
    }
}
