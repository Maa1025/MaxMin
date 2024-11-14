package maxmin;

import java.util.Scanner;

public class MaxMin {
/**
 *
 * @author USER
     * @param args
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Use Scanner for input
        MinMax myMinMax = new MinMax();  // Create an instance of the Calculation class
        Min myMin = new Min();
        
        boolean continueInput = true;  // Initial loop control variable
        
        // Loop system
        while (continueInput) {  // Loop continues until the user decides to stop
            // Input three integers directly
            System.out.print("Enter first integer: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second integer: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Enter third integer: ");
            int num3 = scanner.nextInt();
            
            // Calculate max and min values
            int max = myMinMax.findMax(num1, num2, num3);
            int min = myMin.findMin(num1, num2, num3);
            
            // Display results
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
            
            // Ask if the user wants to continue
            System.out.println("Do you want to input another set of numbers? (true/false)");
            continueInput = scanner.nextBoolean();  // Loop continues based on user's input
        }
        
        System.out.println("Program is Done.");  // Message when loop exits
        scanner.close();  // Close the scanner at the end
    }
}

