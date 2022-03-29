package com.company.comparisonOperators;

public class Main {
    public static void main(String... args){
        // Comparison Operators
        int bayaAge = 19;
        int ramilAge = 18;
        System.out.println(bayaAge == ramilAge);
        System.out.println(bayaAge < ramilAge);
        System.out.println(bayaAge >= ramilAge);
        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;

        System.out.println(isAdult && isStudent); // and - &&
        System.out.println(isAdult || isStudent); // or - ||
        System.out.println(!isAdult && isStudent); // ! - not
    }
}
