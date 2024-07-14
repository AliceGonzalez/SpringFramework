package org.Spring;

public class Dev {

    //private Laptop laptop;

    //FOR AGE since it's private, to access from another class you need to create getter and setter
   private int age;

    public Dev(){
        System.out.println("Dev class constructor compiling");
    }

    //AGE GETTER & SETTER after constructor


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){

        System.out.println("Dev: build method compiling");
    }
}
