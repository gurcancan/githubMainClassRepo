package homework12;

public class Task3Teacher {
/*
Write a Java program called Teacher.
 Identify features and 4 behaviour of that Class.
 Create 3 subclasses MathTeacher,
 ChemistryTeacher and PianoTeacher that would have
 it their own features and behaviour.
Test all 4 classes
 */

    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make student perfect!!");
    }

    public void grade() {
        System.out.println("Grade doesn't matter!!");
    }

    public void attendance() {
        System.out.println("Attendance is important!!");
    }

    public void quiz() {
        System.out.println("Quizzes must be done on time!!");
    }
}

class MathTeacher extends Task3Teacher {
    String subject;
    String grade;

    void excellent() {
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Task3Teacher {
    String homework;
    String test;

    void science() {
        System.out.println("Chemistry is main thing in science");
    }
}

class PianoTeacher extends Task3Teacher {
    String classic;
    String schedule;

    void happy() {
        System.out.println("This class make student happy");
    }
}
