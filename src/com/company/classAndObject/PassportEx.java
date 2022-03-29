package com.company.classAndObject;
import java.time.LocalDate;

public class PassportEx {
    public static void main(String[] args) {
        Passport ukPassport = new Passport(
                "1234",
                LocalDate.of(2025, 1, 3)
        );
        Passport usPassport = new Passport("1234", LocalDate.of(2025, 1, 3));
        System.out.println(usPassport.expiryDate);
        System.out.println(ukPassport instanceof Passport);
    }


    static class Passport {
        String number;
        LocalDate expiryDate;

        Passport(String number, LocalDate expiryDate){
            this.number = number;
            this.expiryDate = expiryDate;
        }
    }


}
