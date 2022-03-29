package com.company.variables;

public class Variables {
    public static void main(String... args){
        byte theByte = -12_8; // 8-bit signed from -128 to 127
        short theShort = 89_89; // 16-bit signed from -32768 to 32767
        int theInt = 1_241_244_443; // 32-bit signed from -2^31 to 2^31-1
        long theLong = 1_434_123_413_124_123_333L; // 64-bit signed from -2^63 to 2^63-1 | in the end L (more preferable) or l
        float theFloat = 123.3_2f; // It less precise than double, but even double we dont able to use for finance transaction such as currencies.
        double theDouble = 123.17271277312731723d; // It is more precise than float, we can write with 'd' and w/o
        boolean theBooleanTrue = true, theBooleanFalse = false;
        System.out.println(theBooleanFalse);
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        if (!theBooleanFalse == theBooleanTrue) {
            System.out.println(4);

        }

        }
}
