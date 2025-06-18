package oops;

public class Cat extends Animal{
    String species;
    //Overriding: Runtime Polymorphism
    @Override
    public void makeSound(){
        System.out.print("Meow");
    }
}
