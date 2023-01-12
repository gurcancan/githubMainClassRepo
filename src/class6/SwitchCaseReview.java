package class6;

public class SwitchCaseReview {
    public static void main(String[] args) {

        String country="Italy";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
