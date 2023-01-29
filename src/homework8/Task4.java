package homework8;

public class Task4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //     input=>This is sentence i want to reverse
        //     output=>sihT si ecnetnes i tnaw ot esrever

        String str="This Is Sentences I want to reverse";

        String [] strArr=str.split(" ");

        for (String word:strArr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}
