package homework12;

public class MultilevelInheritance {}

    //Write program for multilevel inheritance
    // where class C inherits from class B and Class B inherits from Class A

    class ClassA {
        public ClassA(){
            System.out.println("public A");
        }
        public void ClassAa(){
            System.out.println("public void Aa");
        }
    }
    class ClassB extends ClassA{
        public ClassB(){
            System.out.println("public B");
        }
        public void ClassBb(){
            System.out.println("public void Ba");
        }
    }
    class ClassC extends ClassB{
        public ClassC(){
            System.out.println("public C");
        }
        public void ClassCc(){
            System.out.println("public void Cc");
        }
    }

