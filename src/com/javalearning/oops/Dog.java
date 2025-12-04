package com.javalearning.oops;

public class Dog extends Animal{
    //method Overriding: Runtime Polymorphism
    @Override
    public void makeSound(){
        System.out.print("Woof");
    }
}
