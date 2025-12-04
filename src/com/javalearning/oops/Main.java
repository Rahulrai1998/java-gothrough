package com.javalearning.oops;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(10);

        Cat cat = new Cat();
        cat.species = "Indian";
        cat.name = "Lucy";

        System.out.println(cat.name + " " + cat.species);

        //Polymorphism
        Animal dog = new Dog();
        dog.makeSound();

System.out.println(sum(1,2,3));
    }
    public static int sum(int ...n){
        int sm = 0;
        for (int i:n){
            sm+=i;
        }
        return sm;
    }
}
