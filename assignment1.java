import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class match {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student email: ");
        String studentemail = scan.nextLine();
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentemail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("This is a valid student email address.");
        } else {
            System.out.println("This is an invalid student email address.");
        }

        //----------------------------------------------------------------

        System.out.println("Enter phone number: ");
        String phonenum = scan.nextLine();

        Pattern pattern1 = Pattern.compile("\\+63\\d{10}");
        Matcher matcher1 = pattern1.matcher(phonenum);
        boolean match1 = matcher1.matches();
        if (match1) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }

        //----------------------------------------------------------------

        System.out.println("Enter birth date: ");
        String bday= scan.nextLine();

        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher2 = pattern2.matcher(bday);
        boolean match2 = matcher2.matches();
        if (match2) {
            System.out.println("Valid Birth date");
        } else {
            System.out.println("Invalid Birth date");
        }

    }
}

