package class16;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not

    return type => void
    name => isPalindrome
    parameters => String inputStr
    {
    }
    example dad => dad true
    abc => cba false
     */

    public static void main(String[] args) {

        Task3 task3=new Task3();
        task3.isPalindrome("Kaya");

    }

    void isPalindrome(String inputStr){
        StringBuilder str=new StringBuilder(inputStr);
        if (str.reverse().toString().equals(inputStr)){
            System.out.println(inputStr+" is palindrome");
        }else {
            System.out.println(inputStr+" is NOT palindrome");
        }
    }
}
