package homework11;

public class Task1 {
    /*
    Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where
    you will execute both of the constructors 1 by 1.
     */

    String name;
    String rank;
    int age;
    int number;

    Task1 (String eName, String eRank, int eAge, int eNumber){
        name=eName;
        rank=eRank;
        age=eAge;
        number=eNumber;
    }
    void printInfo(){
        System.out.println("Name :"+name+" Rank :"+rank+" Age :"+age+" Number :"+number);
    }
}
