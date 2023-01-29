package class15;

public class MethodPractice2 {
    // create a method that takes a string reverse it and return the reverse String.
    // call the method reverseStr

    // first way of method
    String reverseStr(String input){
        String newStr="";
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }
        return newStr;
    }


    // second way of method
    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    //third way of method
    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
