package com.company.objectClass.cloneOfObject;

public class Main {
    public static void main(String[] args) {
        try{
            Student s1 = new Student(10, "Iskender");
            Student s2 = (Student) s1.clone();
            System.out.println(s1.equals(s2));
            System.out.println(s1 == s2);


        } catch(CloneNotSupportedException c){

        }

    }
}

class Student implements Cloneable {
    int id;
    String name;

    public Student(int id, String name){
        this.name = name;
        this.id = id;

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

