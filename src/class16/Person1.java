package class16;

public class Person1 {
    public static void main(String[] args) {
        //This is different class in same package and can access public and default
        //variables
        Person person=new Person();
        //System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}
