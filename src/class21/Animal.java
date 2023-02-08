package class21;

public class Animal {
    String name;
    String color = "Black";
}
class Cat extends Animal {
    String color = "white";
    int age = 10;
    double weight;
    void printColor() {
        String color = "Blue";
        System.out.println(super.color);//super keyword can only work in a child class!
                                        //super keyword calls instance variables! "Black"
        System.out.println(color);// default calls local variables! "Blue"
        System.out.println(this.color); // this keyword calls variable in Cat class! "White"
    }
}