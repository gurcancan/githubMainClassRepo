package class16;

public class Person {
    private double bankBalance=1250000;
    String address="Street 123";
    public String name="Jon Snow";

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}
