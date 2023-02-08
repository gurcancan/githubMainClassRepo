package class17;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;
    String color;

    Dog(String dogName,String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }
}
