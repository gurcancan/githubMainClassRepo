package class12;

public class StringDemo {
    public static void main(String[] args) {
        //creating an object of the String class
        String strObj = new String("java");

        // another way of creating an object String class a shorter way
        // mostly this is how we create the object of String class
        String strObj2 = "Java";
        System.out.println(strObj2.length());
        String str = "Banana";
        int len = str.length();
        System.out.println(len);
        String name = "Hamid Poya ";
        if (name.length() > 10) {
            System.out.println("Name can't be more than 10 letters");
        }
    }
}
