package class21;

public class Overloading {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);}
    void add(int num1, double num2) {
        System.out.println(num1 + num2);}
    void add(double num1, int num2) {
        System.out.println(num1 + num2);}
    void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);}
}
