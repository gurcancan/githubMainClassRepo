package homework6;

public class Task2DogTester {
    public static void main(String[] args) {

        Task2Dog d1=new Task2Dog();
        Task2Dog d2=new Task2Dog();
        Task2Dog d3=new Task2Dog();

        d1.age=1;
        d1.breed="Husky";
        d1.color="Blond";
        d1.name="Bob";
        d1.bark();
        d1.sleep();

        d2.age=2;
        d2.breed="Bulldog";
        d2.color="black";
        d2.name="Barby";
        d2.bark();
        d2.sleep();

        d3.age=3;
        d3.breed="Labrador";
        d3.bark();

    }
}
