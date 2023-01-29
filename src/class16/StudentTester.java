package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Gurcan";
        student.id="123";
        student.schoolName="Syntax";
        student.age=30;
        student.weight=92.5;

        Student student1=new Student();
        student1.name="Ahmet";
        student1.id="321";
        student1.schoolName="Syntax";
        student1.age=31;
        student1.weight=73;

        Student student2=new Student();
        student2.name="Mehmet";
        student2.id="333";
        //student2.schoolName="Syntax";
        student2.age=31;
        student2.weight=79;
        System.out.println(student2.schoolName);

    }
}
