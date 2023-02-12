package class24;

import javax.lang.model.element.AnnotationMirror;

public abstract class Animal {
    abstract void eat();
    abstract void speak();
    void sleep(){

    }
}
class Cat extends Animal{
    void eat(){
        System.out.printf("Cat eats");
    }
    void speak(){
        System.out.printf("Meaww");
    }
}
abstract class Dog extends Animal{

}
abstract class Bird extends Animal{

}
class TesterAnimal{
    public static void main(String[] args) {

    }
}