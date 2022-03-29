package com.company.OOPprinciples.Encapsulation;
import com.company.OOPprinciples.Encapsulation.packagesAndImport.*;

public class PackagesAndImport extends com.company.OOPprinciples.Encapsulation.packagesAndImport.test1.Main{
    public static void main(String[] args) {
        double res = SampleOfCode.getSquareRoot(4);
        System.out.println(res);
        double res1 = C.getPower(4);
        System.out.println(res1);
        com.company.OOPprinciples.Encapsulation.packagesAndImport.test1.Main.msg();
    }
}
