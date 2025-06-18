package oops;

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


    }
}
