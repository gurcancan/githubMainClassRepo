package homework7;

public class Task2StringReversePrint {
    public static void main(String[] args) {
        //Create a String and print it in reverse order.

        String str="Gurcan Odabasi";
        System.out.println("Correct form :");
        System.out.println(str);

        System.out.println("Reverse form :");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
