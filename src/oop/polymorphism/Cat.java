package oop.polymorphism;

public class Cat extends Animal {
    public static String type = "Cat";

    @Override //Annotation is to make that this method is override like FYI
    public void eat(){
        System.out.println("Cat is eating");
    }
}
