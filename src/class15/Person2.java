package class15;

import class16.Person;

public class Person2 {
    public static void main(String[] args) {
        // This is a class in different package and only can access to public variables
        Person person=new Person();
        //System.out.println(person.bankBalance);
        //System.out.println(person.address);
        System.out.println(person.name);
    }
}
