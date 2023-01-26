package class14;

public class MethodTester2 {
    public static void main(String[] args) {

        //creating an object of the class
        MethodsDemo2 md = new MethodsDemo2();
        md.printHello();//calling a method
        System.out.println("************");
        md.printHelloManyTimes(5);
        System.out.println("#########");
        md.printManyTimes(5,"I love java");

    }
}
