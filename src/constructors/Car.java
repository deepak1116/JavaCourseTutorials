package constructors;

public class Car extends Vehicle{

    public Car(){
        //Inheritance always call parent constructor default when not implicitly called.
        // i.e super() [calls vehicle constructor]
        System.out.println("In Car Constructor");
    }
}
