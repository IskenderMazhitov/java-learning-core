package com.company.scannerClass;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        var userName = scanner.nextLine();
        System.out.println("".format("Hello %s \n What's your age?\n", userName));
        int year = LocalDate.now().minusYears(scanner.nextInt()).getYear();
        System.out.println(String.format("You were born in %d", year ));





    }
}
