package class12;

public class CarTesting {
    public static void main(String[] args) {
        //create the object of the class
        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.model = "i7";
        bmw.color = "Blue";
        bmw.year = 2023;
        bmw.moveForward();
        bmw.applyBreaks();

        Car hyundai = new Car();
        hyundai.year = 2013;
        hyundai.model = "Elentra";
        hyundai.color = "Grey";
        hyundai.moveForward();
        hyundai.applyBreaks();

    }
}
