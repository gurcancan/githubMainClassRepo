package class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please create an username");
        String userName = scan.next();
        System.out.println("Please create a password");
        String passWord = scan.next();
        System.out.println("Please enter you password again");
        String confirmPassWord = scan.next();

        boolean userNameEmpty = userName.isEmpty();
        boolean passWordEmpty = passWord.isEmpty();
        boolean passWordContains = passWord.contains(userName);
        boolean passWordEquals = passWord.equals(confirmPassWord);

        if (userNameEmpty || passWordEmpty) {
            System.out.println("Username and Password can not be empty ");
        } else if (passWord.length() < 8) {
            System.out.println("Password is too short ");
        } else if (passWordContains) {
            System.out.println("Password can not contains username");
        } else if (passWordEquals == false) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }
}
