package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
// Creating an actual object from the class Scanner
        Scanner scanner=new Scanner(System.in);
// This is how we create the objects of a class
        Dog dog1=new Dog();
        Dog jacky=new Dog();
        jacky.sleep();
        dog1.bark();
        dog1.eat();

    }

}
