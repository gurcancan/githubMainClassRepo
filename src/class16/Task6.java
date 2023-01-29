package class16;

public class Task6 {
    /*
    Create a Class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
    /*
    return type => String
    name => getGrade
    parameter => int score
     */

    String getGrade(int score){
        if (score>=90){
            return "A";
        } else if (score>=80) {
            return "B";
        } else if (score>=70) {
            return "C";
        } else if (score>=60) {
            return "D";
        }else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Task6 task6=new Task6();
        System.out.println("Your Grade is : "+task6.getGrade(85));
    }
}
