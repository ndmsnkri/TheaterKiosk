import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's age as an integer
        int age = in.nextInt();

        // Check if the user is 21 or older and display a message
        if (age >= 21) {
            System.out.println("Congratulations! You get a wristband.");
        } else {
            // If the user is not 21 or older, the program does nothing
            System.out.println("Sorry, you are not eligible for a wristband.");
            //ask nad about this
        }
    }
}
