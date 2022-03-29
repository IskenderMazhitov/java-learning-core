package com.company.OOPprinciples;

public class Inheritance {
    public static void main(String[] args) {
        Animal ramil = new Animal("Ramil");
        ramil.voice();
        ramil.setVoice("asal amok");
        ramil.voice();
        Dog baistan = new Dog("Baistan");
        baistan.voice();
        System.out.println(baistan instanceof Animal & ramil instanceof Animal);


    }
}
class Animal{
    private String voice;
    String name;
    float weightInKg;
    Animal(String name){
        this.name = name;
    }
    void voice(){
        if (this.voice == null)
            System.out.println("I don't have a voice, I'm russian");

        else
            System.out.println(String.format("%s...", this.voice));
    }
    final void setVoice(String voice){
        this.voice = voice;
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
    @Override // I dont know why yet
    void voice(){
        System.out.println("bark...");
    }
}

