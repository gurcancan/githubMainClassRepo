package class15;

public class Task {
    /*
    Create a method createEmail(). Based on values of users firstName,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    /*
    return type => String
    name => createEmail
    parameters => String firstName, String lastName , String emailType
    {
    concat
    }
     */

    String createEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {

        Task email=new Task();
        System.out.println(email.createEmail("gurcan","odabasi","gmail"));
    }
}
