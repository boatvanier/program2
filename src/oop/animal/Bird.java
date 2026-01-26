package oop.animal;

public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void fly() {
        System.out.println("this bird is flying");
    }
}
