package com.company.loops;

import java.util.Arrays;

public class forLoop {
    public static void main(String[] args) {
        String[] pythonLang = {"Def", "Easy", "Edd"};

        for (int i = 0; i < pythonLang.length; i++){
            System.out.println(pythonLang[i]);
        }
        for (String lang: pythonLang){
            System.out.println(lang);

        }
        for (int i = pythonLang.length - 1; i >= 0; i--) {
            System.out.println(pythonLang[i]);
        }
        Arrays.stream(pythonLang).forEach(System.out::println);
        Arrays.stream(new String[]{"hallo","hi"}).forEach(System.out::println);
    }
}
