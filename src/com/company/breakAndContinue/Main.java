package com.company.breakAndContinue;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name: names){
            if (name.length() == 3){
                continue;
            }
            System.out.println(name);
        }
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.print("| ");
        for (String coffee : copyTo) {
            System.out.print(coffee + " | ");
        }
        System.out.println("\n");
        for (String coffee: copyTo){
            if (coffee.startsWith("A")){
                break;
            }
            System.out.println("Ok, " + coffee + "will pass");

        }
    }
}
