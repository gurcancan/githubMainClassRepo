package homework13;

public class Task1 {
    // Create 1 class in which create a method that will calculate the
    // area of *Rectangle and *Square
    // use separate class to test your code.

    void calculateArea(int width, int height){
        System.out.println("Area of rectangle = "+(width*height));
    }
    void calculateArea(double side){
        System.out.println("Area of square = "+(side*side));
    }
}
class Task1Tester {
    public static void main(String[] args) {
        Task1 areaCalculator=new Task1();
        areaCalculator.calculateArea(4,6);
        areaCalculator.calculateArea(5);
    }
}
