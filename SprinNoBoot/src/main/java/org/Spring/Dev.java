package org.Spring;

public class Dev {
    //OBJECTS
    private Laptop laptop;

    //VARIABLE
    // FOR AGE since it's private, to access from another class you need to create getter and setter
   private int age;

   //CONSTRUCTORS
    public Dev(){
        System.out.println("Dev class constructor compiling");
    }

    public Dev(int age){
        this.age = age;
        System.out.println("Dev 1 constructor");
    }


    //AGE GETTER & SETTER after constructor
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    //METHODS
    public void build(){
        System.out.println("Dev: build method compiling");
        laptop.compile();
    }
}
