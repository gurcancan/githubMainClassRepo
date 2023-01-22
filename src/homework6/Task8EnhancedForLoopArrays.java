package homework6;

public class Task8EnhancedForLoopArrays {
    /*
    Create 2D array of countries: north america countries, south america countries,
    europe countries, asian countries, african countries.
    Then print all values from that array using 2 different loops and calculate
    how many total countries been stored
     */
    public static void main(String[] args) {


        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United Kingdom", "France", "Spain"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}};

// using for loops
        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("Total Countries "+counter);

        System.out.println("**************");

// using enhanced for loop
           int counter1=0;
        for (String [] country:countries){
            for (String s:country){
                System.out.print(s+" ");
                counter1++;
            }
            System.out.println();
        }
        System.out.println("There are "+counter1+" countries");
    }
}
