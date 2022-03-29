// Aggregation

package com.company.OOPprinciples;

public class Aggregation {
    public static void main(String[] args) {
        Address addressIs = new Address("Logivnenko", "Bokanbaeva", "Pervomaiskii", 8);
        Person iskenderInfo = new Person("Iskender", 19, addressIs);
        System.out.println(iskenderInfo.address.street);


    }

}

class Person {
    String name;
    int age;
    Address address;
    public void doit(){
        System.out.println("Jello");
    }
    Person(){

    }
    Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class Address{
    String street;
    String street2;
    String district;
    int houseNumber;
    Address(String street, String street2, String district, int houseNumber){
        this.street = street;
        this.street2 = street2;
        this.district = district;
        this.houseNumber = houseNumber;
    }










}
