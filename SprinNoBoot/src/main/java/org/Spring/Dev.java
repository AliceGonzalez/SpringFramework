package org.Spring;

public class Dev {

    //OBJECTS-DEPENDENCY
    private Computer comp;


   //CONSTRUCTORS
    public Dev(){
        System.out.println("Dev class constructor compiling");
    }


    //AGE GETTER & SETTER after constructor

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


    //METHODS
    public void build(){
        System.out.println("Dev: build method compiling");
        comp.compile();
    }
}
