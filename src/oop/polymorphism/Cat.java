package oop.polymorphism;

public class Cat extends Animal {

    @Override //Annotation is to make that this method is override like FYI
    public void eat(){
        System.out.println("Cat is eating");
    }
}
