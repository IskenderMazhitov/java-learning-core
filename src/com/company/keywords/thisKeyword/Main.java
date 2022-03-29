package com.company.keywords.thisKeyword;

public class Main {
    public static void main(String[] args) {
        Complex c = new Complex(9, 3);
        Complex c1 = new Complex(4);
        Complex c2 = new Complex();
        System.out.println(c.getVar());
        System.out.println(c1.getVar());
        System.out.println(c2.getVar());
        System.out.println(c1.add(c1));
        ThisInstance x = new ThisInstance(3, 4);


    }
}

class Complex{
    int i, j;
    Complex(int i, int j){
        this.i = i;
        this.j = j;
    }
    Complex(int i){
        this(i, i);
    }
    Complex(){
        this(0);
    }
    String getVar(){
        return this.i + "+" + this.j + "i";
    }
    int add(Complex o){
        return o.i + o.j;
    }

}
class ThisInstance {
    int x, y;
//    int res;
    ThisInstance(int y, int x){
        this.x = x;
        this.y = y;
        System.out.println("Before passing this to add() method: ");
        System.out.println("x = " + this.x + ", y = " + this.y);
        System.out.println("And sum of this integer: ");
        System.out.println(add(this));
    }
    int add(ThisInstance o){
        return o.x + o.y;
    }
}
