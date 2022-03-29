package com.company.keywords.superKeyword;
/* Keyword super usage in java in 3 conditions:
1. super can be used to refer immediate parent class instance variable
2. super can be used to invoke immediate parents class methods
3. super() can be used to invoke immediate parent class constructor
*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Baistan");
        dog.printName();




    }
}

class Animal {
    String name = "No identifier name";
    Animal(){
    }
    Animal(String name){
        this.name = name;
    }


    void printName(){
        System.out.println(this.name);

    }

}

class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    void printName(){
        System.out.println(this.name);
        System.out.println(super.name);
        super.printName();
    }
}

