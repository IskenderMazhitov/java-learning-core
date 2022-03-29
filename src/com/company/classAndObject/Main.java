package com.company.classAndObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens(
                "Sony",
                "86mm",
                true);

    }
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }


    }
}
