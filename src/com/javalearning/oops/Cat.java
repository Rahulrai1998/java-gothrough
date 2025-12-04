package com.javalearning.oops;

public class Cat extends Animal{
    String species;
    //method Overriding: Runtime Polymorphism
    @Override
    public void makeSound(){
        System.out.print("Meow");
    }
}
