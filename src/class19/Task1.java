package class19;

public class Task1 {
    /*
    Write a Student class that have  instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given student using displayInfo method.
     */
    String name;
    String address;

    Task1(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student address : "+address);
    }

    public static void main(String[] args) {
        Task1 student=new Task1("Gurcan","679 student street");
        student.displayInfo();
    }
}
