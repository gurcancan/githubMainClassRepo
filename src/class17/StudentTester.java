package class17;

public class StudentTester {
    public static void main(String[] args) {
        Student student1=new Student("AC1001","ahmet",20,70);
        Student student2=new Student("AC1002","mehmet",22,75);
        Student student3=new Student("AC1003","veli",23,80);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}

