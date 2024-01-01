import java.util.*;

public class palindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter The Number: ");

        // Read the input number from the user
        int number = scanner.nextInt();

        // Initialize variables to store the reversed result and a copy of the original number
        int result = 0;
        int x = number;

        // Reverse the digits of the input number
        while (number != 0) {
            // Extract the last digit of the current value of the number
            int lastDigit = number % 10;

            // Update the result by multiplying it by 10 and adding the last digit
            result = result * 10 + lastDigit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Display the reversed result
        System.out.println("Reversed Number: " + result);

        // Display the original number
        System.out.println("Original Number: " + x);
    }
}
