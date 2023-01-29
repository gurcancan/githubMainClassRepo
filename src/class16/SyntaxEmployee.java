package class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three variables empID , salary and set the CEO to "Sumair"
    Create two objects of the class SyntaxEmployee
    Set the value of empID, salary for each of the objects
    Print out the eID , salary and CEO for each of the objects
     */
    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee e1=new SyntaxEmployee();
        e1.empID="1234";
        e1.salary=10000;
        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(e1.CEO);

        System.out.println("*********");

        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID="4321";
        e2.salary=12000;
        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(e1.CEO);

    }
}
