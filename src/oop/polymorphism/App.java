package oop.polymorphism;

public class App {
    public static void main(String[] args) {
        Animal  dog = new Dog();
        Animal animal = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        dog = new Cat();

        dog.eat();
        cat.eat();
        animal.eat();
        dog1.eat();
        dog1.eat("meat");

//        ((Dog) dog).bark();
    }
}
