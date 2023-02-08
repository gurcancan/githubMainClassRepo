package homework13;

public class Programming {
    Programming(){
        System.out.println("I love programming language");
    }
    Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        new Programming("java");
        Programming programming=new Programming();
    }
}
