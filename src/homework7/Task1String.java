package homework7;

public class Task1String {
    public static void main(String[] args) {

        //Create a String and if the String is not empty perform the following:
        //if the String has odd number of characters and has 3 or characters, print the character
        //in the middle of the String.

        String str = "Today is Java";
        int len = str.length();
        System.out.println(len);
        int i = len / 2;

        if (!str.isEmpty()&&str.length()>=3) {
            if (len % 2 != 0) {
                System.out.println("The middle character is " + str.charAt(i));
            } else {
                System.out.println("There are even numbers of character in the String.");
            }
        }
    }
}
