package com.company.switchStatement;

import java.util.Locale;

public class Main {
    public static void main(String... args){
        // Switch statement
        String gender = "male";
        if (gender.equals("FEMALE")){

        }
        else if(gender.equals("MALE")){

        }
        else if (gender.equals("PREFER_NOT_SAY")){

        }
        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I'm a female");
                break;
            case "MALE":
                System.out.println("I'm a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("I'm a semale");
                break;
            default:
                System.out.println("I don't know who am I");
        }
    }
}
