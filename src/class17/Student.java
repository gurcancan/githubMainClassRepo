package class17;

public class Student {
    /*
    Create a class call it student define 4 instance fields like ID Name Age Weight
    Create % objects of this class do this task without constructors and with constructors.
     */

    String id;
    String name;
    int age;
    double weight;

    public Student(String studentId,String studentName,int studentAge,double studentWeight){
        id=studentId;
        name=studentName;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfo(){
        System.out.println("ID "+id+" Name "+name+" Age "+age+" Weight "+weight);
    }
}
