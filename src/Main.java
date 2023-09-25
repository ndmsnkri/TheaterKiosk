import java.util.Scanner;

public class Main { // class Main
    public static void main(String[] args) { // main ()
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);
        // num age = 0
        // num DRINKING_AGE = 21

        // Prompt the user to enter their age
        System.out.print("Enter your age: "); // output "Enter your age:"

        // Read the user's age as an integer
        int age = in.nextInt(); // input age

        // Check if the user is 21 or older and display a message
        if (age >= 21) // if age > = DRINKING_AGE then
        {
            System.out.println("Congratulations! You get a wristband."); // output "You get a wristband"
        } // end if
    } // return
} // end Class
