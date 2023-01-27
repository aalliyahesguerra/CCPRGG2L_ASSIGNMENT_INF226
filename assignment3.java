import java.util.Scanner;

public class maarteog {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 150;

    public static void main(String[] args) throws Exception {
        System.out.println("MY TARGET WEIGHT IS 150LBS!");
        System.out.print("Enter current weight in lbs: ");
        int weight = scan.nextInt();

        if (weight > targetWeight) {
        fixDietandExercise(weight);    
    } else {
            System.out.println("Current weight must be greater than 150 lbs!");
        }
        scan.close();
    }

    static void loseWeight(int currentWeight) {

        System.out.println("Eating right!");
        System.out.println("Doing exercises!");

        currentWeight = checkWeight(currentWeight);

        // Define the base case by using an if condition. The target weight is 150 lbs
        // Do something to reach the target. Call the fixDietandExercise() method
        // Do the recursive call. Call the loseWeight() method
      
        // if the target weight has been reached, print the code below.
        // System.out.println("I have reached my target weight!");
           
    }

    static int checkWeight(int currentWeight) {
        System.out.println("My current weight is: " + currentWeight + "lbs");
        if (currentWeight == targetWeight) {
            System.out.println("Yey! I have reached my target weight!");
            return targetWeight;
        } else if (currentWeight > targetWeight) {
            System.out.println("I need to lose " + (currentWeight-targetWeight) 
            +" lbs to reach my target weight.");
            fixDietandExercise(currentWeight);
        }
        return currentWeight;
    }

    static int fixDietandExercise(int weight) {

        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();
        int currentWeight = weight - weightlost;
        loseWeight(currentWeight);

        return currentWeight;
    }
}