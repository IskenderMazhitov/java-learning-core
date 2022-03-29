package com.company.ifStatement;

public class Main {
    public static void main(String[] args){
        int age = 17;
        if (age >= 18){
            System.out.println("Hooray... I'm an adult");
        }

        else {
            System.out.println("I'm not an adult");
//            System.out.println(NotMain.main());

        }
        // Ternary operator
        age = 20;
        String message = age >= 18 ? "Hooray... I'm an adult" : "I'm not an adult";
        System.out.println(message);

    }
}

