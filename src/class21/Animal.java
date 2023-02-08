package class21;

public class Animal {
    String name;
    String color = "Black";

}

class Cat extends Animal {

    String color="white";

    int age = 10;

    double weight;
}

class AnimalTester {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.color);
    }
}