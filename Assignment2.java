import java.util.Scanner;

public class Assignment2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("student");
        scan.close();
    }

    static void drive(String student) {

        System.out.println("Driving...");
        test(student);

        String feedback = getFeedBack(student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            improveSkills(student);

            // Recursive call
            drive(student);
        } else if (feedback.equals("yes")) {
            Approve(student);
        }
    }

    static void test(String student) {
        System.out.println("Drive Testing");
    }

    static String getFeedBack(String student) {
        System.out.println("Is the student approved to drive? (Enter \"yes\" or \"no\") ");

        String feedback = scan.next();

        return feedback;
    }

    static void improveSkills(String student) {
        System.out.print("What skill do you need to improve? ");
        String skill = scan.next();
        System.out.println("You need to improve your skill in " + skill);
    }

    static void Approve(String student) {
        System.out.println("Congrats, Student is now approved to drive!");
    }

}