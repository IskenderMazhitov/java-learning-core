package com.company.keywords.finalKeyword;

public class Main {
    public static void main(String[] args) {
        AClass a = new AClass("Iskender");
        a.print(a.name);


    }
}

final class AClass{
    final String name; // only constructor can reinitialized final instance of class;
    AClass(String name){
        this.name = name;
    }
    final void print // final method cannot be overriden in child class
            (final String name){ // final param cannot be changed into method.
                System.out.println("Hello, " + name); // I know that its shit code in terms of pasting addition params
                // instead of using directly to name into class
    }

} // cannot be extended by child classes
