package class13;

public class StringRecap {
    public static void main(String[] args) {

        //how to print all the character from string
        String str="Java is Great";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("***************");

        //how many times a letter has appeared in the String
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("The letter has appeared "+count+" times");
        System.out.println("********************");


    }
}
