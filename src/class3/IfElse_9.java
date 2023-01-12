package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if (c=='M')
        {
            System.out.println("Male");
        }
        String name="Nat";
        // with non-primitive data type such as String we can't use == symbol
        if (name.equals("Sam"))
        {
            System.out.println("Amazing student");
        }
        if (!name.equals("Sam"))
        {
            System.out.println("Super Amazing Student");
        }
        String lishet="love";
        if (lishet.equals("love"))
        {
            System.out.println("lishet, love you babe");
        }

    }
}
