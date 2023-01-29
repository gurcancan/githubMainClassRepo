package class16;

import java.net.ServerSocket;

public class Task4 {
    /*
    Create a method that will say Hello in different languages based on
    the country that will be passed when method us executed.

    return type => String void
    name => sayHello
    parameter => String countryName
    {
    }
     */

    String sayHello(String countryName){

        switch (countryName){
            case "USA":
                return "Hello";
            case "Turkey":
                return "Merhaba";
            case "Spain":
                return "Hola";
            case "Italy":
                return "Ciao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();

        System.out.println(task4.sayHello("Turkey"));

    }
}
