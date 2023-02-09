package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    void speak() {
        System.out.println("Animal Speaks");
    }

    void eat() {
        System.out.println("All the animal eat");
    }

}

class Cat extends Animal {
    // we are overRiding speak method in Cat class.
    void speak() {
        System.out.println("Cat Meow Meow...");
    }

    void printName() {
        System.out.println(name);
    }
}

class Dog extends Animal {

}

class Tester {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
    }
}