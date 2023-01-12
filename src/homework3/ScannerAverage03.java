package homework3;

import java.util.Scanner;

public class ScannerAverage03 {
    public static void main(String[] args) {
        int quizScore, midScore, finalScore;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter quiz ");
        quizScore = scan.nextInt();
        System.out.println("Please Enter mid");
        midScore = scan.nextInt();
        System.out.println("Please Enter final");
        finalScore = scan.nextInt();

        int grade = (quizScore + midScore + finalScore) / 3;
        System.out.println("grade " + grade);

        if (grade >= 90) {
            System.out.println("grade=A");
        } else if (grade >= 70 && grade <= 90) {
            System.out.println("grade=B");
        } else if (grade >= 50 && grade <= 70) {
            System.out.println("grade=C");
        } else {
            System.out.println("grade=F");
        }
    }
}
