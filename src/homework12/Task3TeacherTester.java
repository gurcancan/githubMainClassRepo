package homework12;

public class Task3TeacherTester {
    public static void main(String[] args) {
        Task3Teacher teacher=new Task3Teacher();
        teacher.teacherName="gurcan";
        teacher.teacherId="gg11gg11";
        System.out.println("School principal "+teacher.teacherName+" and his id "+teacher.teacherId);
        teacher.homework();

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.teacherName="Joe";
        mathTeacher.teacherId="1232131";
        mathTeacher.subject="Math";
        System.out.println("Math teacher is "+mathTeacher.teacherName+" and his id "+mathTeacher.teacherId);
        mathTeacher.grade();
        mathTeacher.homework();
        mathTeacher.excellent();
        mathTeacher.attendance();


    }
}
