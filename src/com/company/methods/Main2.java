package com.company.methods;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        char[] letters = {'a', 'a', 'b', 'c', 'd', 'd','d'};
        System.out.println(countLettersOccurrences(letters, 'a'));
    }


    public static int countLettersOccurrences(
            char[] args, char searchLetter){
        int res = 0;
        for (char arg: args){
            if (arg == searchLetter){
                res++;
            }

        }

        return res;
    }

}
