package class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName="Gurcan";
        String lastName="Odabasi";
        String fullName=firstName+" "+lastName;// most common way
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(" "+lastName));
    }
}
